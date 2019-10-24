package com.tuiba.saasadmininster.shop.service;

import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.entity.PageResult;
import com.tuiba.saasadmininster.shop.bean.Shop;

/**
 * @author : yangzhi
 * @date : 11:45 2019/10/11
 */
public interface ShopService {

    /**
     *  保存商品
     * @param shop
     */
    public Results saveShops(Shop shop);

    /**
     *  删除商品
     * @param shopId
     */
    public Results delShops(Integer[] shopId);

    /**
     *  根据id查询商品
     */
    public Results getShopAll(Integer shop_id);

    /**
     *  编辑商品
     */
    public Results updateShop(Shop shop);

    /**
     *  分页查询
     * @param page  当前页
     * @param size  显示条数
     * @return
     */
    public PageResult findPage(int page, int size);

    /**
     *  查询所有
     * @return
     */
    public Results findAllShop();

    /**
     *  商品上架
     * @param shop_id   商品id  商品状态 0：上架   1：下架
     * @param
     * @return
     */
    public Results onShop(Integer shop_id);

    /**
     *  商品下架
     * @param shop_id   商品id  商品状态 0：上架   1：下架
     * @return
     */
    public Results underShop(Integer shop_id);
}
