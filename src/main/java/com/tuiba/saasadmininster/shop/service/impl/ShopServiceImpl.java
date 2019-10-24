package com.tuiba.saasadmininster.shop.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tuiba.saasadmininster.Exception.MyException;
import com.tuiba.saasadmininster.Exception.ResultEnum;
import com.tuiba.saasadmininster.Exception.ResultUtil;
import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.entity.PageResult;
import com.tuiba.saasadmininster.shop.bean.Shop;
import com.tuiba.saasadmininster.shop.bean.ShopExample;
import com.tuiba.saasadmininster.shop.dao.ShopMapper;
import com.tuiba.saasadmininster.shop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author : yangzhi
 * @date : 11:50 2019/10/11
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;

    /**
     * 添加商品
     *
     * @param shop
     */
    @Override
    public Results saveShops(Shop shop) {
        //通过实体类设置存入时间和删除状态
        shop.setShopAddDate(new Date().getTime());
        shop.setShopStatus(0);
        shop.setShopDeleteType(0);
        shopMapper.insert(shop);
        return ResultUtil.successce(shop);
    }

    /**
     * 删除商品
     *
     * @param shopId
     */
    @Override
    public Results delShops(Integer[] shopId) {
        for (int i = 0; i < shopId.length; i++) {
            Shop shop = shopMapper.selectByPrimaryKey(shopId[i]);
            if (shop == null) {
                throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
            }
            shopMapper.deleteByPrimaryKey(shopId[i]);
        }
        return ResultUtil.success();
    }

    /**
     * 按照id查询商品
     *
     * @param shop_id
     * @return
     */
    @Override
    public Results getShopAll(Integer shop_id) {
        if (shop_id == 0){
            throw new MyException("所查询商品ID不存在");
        }
            Shop shop = shopMapper.selectByPrimaryKey(shop_id);
        if (shop == null) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        return ResultUtil.successce(shop);
    }

    /**
     * 编辑商品
     *
     * @param shop
     * @return
     */
    @Override
    public Results updateShop(Shop shop) {
        Integer shopId = shop.getShopId();
        //  通过ID查询商品实体
        Shop shopId_List = shopMapper.selectByPrimaryKey(shopId);
        if (shopId_List == null) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        shopId_List.setShopName(shop.getShopName());            //商品名称
        shopId_List.setShopNum(shop.getShopNum());              //商品数量
        shopId_List.setShopScore(shop.getShopScore());          //商品兑换所需积分
        shopId_List.setShopModifyDate(new Date().getTime());    //商品修改时间
        shopId_List.setShopMiaoshu(shop.getShopMiaoshu());      //商品描述
        shopId_List.setShopXiangqing(shop.getShopXiangqing());  //商品详情
        shopId_List.setShopImg(shop.getShopImg());              //商品图片
        shopMapper.updateByPrimaryKey(shopId_List);
        return ResultUtil.successce(shopId_List);
    }

    /**
     * 分页查询
     *
     * @param page 当前页
     * @param size 显示条数
     * @return
     */
    @Override
    public PageResult findPage(int page, int size) {
        //分页
        PageHelper.startPage(page, size);
        try {
            //创建Example对象并通过字段对比
            ShopExample shopExample = new ShopExample();
            ShopExample.Criteria criteria = shopExample.createCriteria();
            criteria.andShopStatusEqualTo(0);
            //将对象为0的分页查询
            Page<Shop> shopList = (Page<Shop>) shopMapper.selectByExample(shopExample);
            return new PageResult(shopList.getTotal(), shopList.getResult());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public Results findAllShop() {
        //获取实体对象并创建集合
        List<Shop> shopList = shopMapper.selectByExample(null);
        return ResultUtil.successce(shopList);
    }

    /**
     * 商品上架
     *
     * @param shop_id 商品id 商品状态 0：上架   1：下架
     * @param
     * @return
     */
    @Override
    public Results onShop(Integer shop_id) {
        Shop shop = shopMapper.selectByPrimaryKey(shop_id);
        if (shop == null) {
            throw new MyException("操作失败");
        }
        Integer shopStatus = shop.getShopStatus();
        if (shopStatus == 1) {
            shop.setShopStatus(0);
            shopMapper.updateByPrimaryKeySelective(shop);
        }
        return ResultUtil.successce(shop);
    }

    /**
     * 商品下架
     *
     * @param shop_id 商品id  商品状态 0：上架   1：下架
     * @return
     */
    @Override
    public Results underShop(Integer shop_id) {
        Shop shop = shopMapper.selectByPrimaryKey(shop_id);
        if (shop == null) {
            throw new MyException("操作失败");
        }
        Integer shopStatus = shop.getShopStatus();
        if (shopStatus == 0) {
            shop.setShopStatus(1);
            shopMapper.updateByPrimaryKeySelective(shop);
        }
        return ResultUtil.successce(shop);
    }
}
