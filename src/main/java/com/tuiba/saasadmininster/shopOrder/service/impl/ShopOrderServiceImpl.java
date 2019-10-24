package com.tuiba.saasadmininster.shopOrder.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tuiba.saasadmininster.Exception.MyException;
import com.tuiba.saasadmininster.Exception.ResultEnum;
import com.tuiba.saasadmininster.Exception.ResultUtil;
import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.entity.PageResult;
import com.tuiba.saasadmininster.shop.bean.Shop;
import com.tuiba.saasadmininster.shopOrder.bean.ShopOrder;
import com.tuiba.saasadmininster.shopOrder.bean.ShopOrderExample;
import com.tuiba.saasadmininster.shopOrder.dao.ShopOrderMapper;
import com.tuiba.saasadmininster.shopOrder.service.ShopOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 商品兑换记录
 *
 * @author : yangzhi
 * @date : 11:22 2019/10/16
 */
@Service
public class ShopOrderServiceImpl implements ShopOrderService {

    @Autowired
    private ShopOrderMapper shopOrderMapper;

    /**
     * 保存订单兑换信息
     *
     * @param shopOrder 商品订单信息实体
     */
    @Override
    public Results saveShopOrder(ShopOrder shopOrder) {
        Integer shopOrderId = shopOrder.getShopOrderId();
        ShopOrder shopOrder1 = shopOrderMapper.selectByPrimaryKey(shopOrderId);
        if (shopOrder1 == null) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        //保存信息
        shopOrderMapper.updateByPrimaryKeySelective(shopOrder1);
        return ResultUtil.successce(shopOrder1);
    }

    /**
     * 根据id查询
     *
     * @param shopOrderId 商品兑换订单id
     * @return
     */
    @Override
    public Results findByIdAll(Integer shopOrderId) {
        ShopOrder shopOrder = shopOrderMapper.selectByPrimaryKey(shopOrderId);
        if (shopOrder == null) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        return ResultUtil.successce(shopOrder);
    }

    /**
     * 查询所有商品兑换状态
     *
     * @param shop_status 商品兑换状态(0待审核 1通过 2 不通过（返还积分）
     * @return
     */
    @Override
    public Results findByStatusAll(Integer shop_status) {
        ShopOrderExample shopOrderExample = new ShopOrderExample();
        shopOrderExample.createCriteria().andShopStatusEqualTo(shop_status);
        List<ShopOrder> shopOrders = shopOrderMapper.selectByExample(shopOrderExample);
        if (shopOrders == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        return ResultUtil.successce(shopOrders);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public Results findAllShopOrder() {
        List<ShopOrder> shopOrders = shopOrderMapper.selectByExample(null);
        return ResultUtil.successce(shopOrders);
    }


    /**
     * 商品兑换审核通过
     *
     * @param shopOrderId 商品兑换订单id
     * @return
     */
    @Override
    public Results auditShopOrder(Integer shopOrderId) {
        //通过id获取所有商品订单状态
        ShopOrder shopOrder = shopOrderMapper.selectByPrimaryKey(shopOrderId);
        if (shopOrder == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        Integer shopStatus = shopOrder.getShopStatus();
        if (shopStatus == 0) { //如果订单为0（待审核）修改为1（通过）并重新修改
            shopOrder.setShopStatus(1);
            shopOrder.setShopShenheTime(new Date().getTime());//审核通过时间
            shopOrderMapper.updateByPrimaryKeySelective(shopOrder);
        }
        return ResultUtil.successce(shopOrder);
    }

    /**
     * 审核不通过
     *
     * @param shopOrderId
     * @return
     */
    @Override
    public Results auditNoShopOrder(Integer shopOrderId) {
        ShopOrder shopOrder = shopOrderMapper.selectByPrimaryKey(shopOrderId);
        if (shopOrder == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        Integer shopStatus = shopOrder.getShopStatus();
        if (shopStatus == 0) { //如果订单为0（待审核）修改为1（通过）并重新修改
            shopOrder.setShopStatus(2);
            shopOrder.setShopShenheTime(new Date().getTime());//审核通过时间
            shopOrder.setBak1("商品兑换审核未通过，请联系管理员申请返回积分");
            shopOrderMapper.updateByPrimaryKeySelective(shopOrder);
        }
        return ResultUtil.successce(shopOrder);
    }

    /**
     * 根据用户id查询
     *
     * @param userId
     * @return
     */
    @Override
    public Results findByUserId(Integer userId) {
        //若商品订单号不存在，抛异常
        if (userId == null) {
            throw new MyException("用户不存在！");
        }
        ShopOrderExample shopOrderExample = new ShopOrderExample();
        ShopOrderExample.Criteria criteria = shopOrderExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<ShopOrder> shopOrders = shopOrderMapper.selectByExample(shopOrderExample);
        if (shopOrders == null) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        return ResultUtil.successce(shopOrders);
    }

    /**
     * 分页查询
     *
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageResult findPage(int page, int size) {
        if (page == 0 || size == 0) {
            throw new MyException("查询失败");
        }
        PageHelper.startPage(page, size);
        Page<ShopOrder> shopOrders = (Page<ShopOrder>) shopOrderMapper.selectByExample(null);
        return new PageResult(shopOrders.getTotal(), shopOrders.getResult());
    }

    /**
     * 删除
     *
     * @param shopOrderId
     * @return
     */
    @Override
    public Results delShopOrder(Integer[] shopOrderId) {
        if (shopOrderId.length == 0) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        for (int i = 0; i < shopOrderId.length; i++) {
            ShopOrder shopOrder = shopOrderMapper.selectByPrimaryKey(shopOrderId[i]);
            if (shopOrder == null) {
                throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
            }
            shopOrderMapper.deleteByPrimaryKey(shopOrderId[i]);
        }
        return ResultUtil.success();
    }
    /**
     * 根据商品兑换订单号查询
     *
     * @param shopOrderNum 商品兑换订单号
     * @return
     */
    @Override
    public Results findByShopOrderNum(String shopOrderNum) {
        //若商品订单号不存在，抛异常
        if (shopOrderNum == null || "".equals(shopOrderNum)) {
            throw new MyException("商品兑换订单号不存在！");
        }
        ShopOrderExample shopOrderExample = new ShopOrderExample();
        shopOrderExample.createCriteria().andShopOrderNumEqualTo(shopOrderNum);
        List<ShopOrder> shopOrders = shopOrderMapper.selectByExample(shopOrderExample);
        if (shopOrders.size() == 0) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        return ResultUtil.successce(shopOrders);
    }


    /**
     * 根据商品兑换码查询
     *
     * @param shopCdk 商品兑换码
     * @return
     */
    @Override
    public Results findByShopCdk(String shopCdk) {
        //若商品订单号不存在，抛异常
        if (shopCdk == null || "".equals(shopCdk)) {
            throw new MyException("商品兑换码不存在！");
        }
        ShopOrderExample shopOrderExample = new ShopOrderExample();
        shopOrderExample.createCriteria().andShopCdkEqualTo(shopCdk);
        List<ShopOrder> shopOrders = shopOrderMapper.selectByExample(shopOrderExample);
        if (shopOrders.size() == 0) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        return ResultUtil.successce(shopOrders);
    }

    /**
     * 根据商品兑换时间查询
     *
     * @param shopOrderDate 商品兑换时间
     * @return
     */
    public Results findByShopOrderDate(Long shopOrderDate) {
        //若商品订单号不存在，抛异常
        if (shopOrderDate == 0) {
            throw new MyException("商品兑换时间不存在！");
        }
        ShopOrderExample shopOrderExample = new ShopOrderExample();
        shopOrderExample.createCriteria().andShopOrderDateEqualTo(shopOrderDate);
        List<ShopOrder> shopOrders = shopOrderMapper.selectByExample(shopOrderExample);
        if (shopOrders.size() == 0) {
            throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
        }
        return ResultUtil.successce(shopOrders);
    }
}