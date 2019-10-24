package com.tuiba.saasadmininster.shopOrder.service;

import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.entity.PageResult;
import com.tuiba.saasadmininster.shopOrder.bean.ShopOrder;

/**
 * @author : yangzhi
 * @date : 11:14 2019/10/16
 */
public interface ShopOrderService {

    /**
     *  保存订单兑换信息
     * @param shopOrder 商品订单信息实体
     */
    public Results saveShopOrder(ShopOrder shopOrder);

    /**
     *  根据id查询
     * @param shopOrderId   商品兑换订单id
     * @return
     */
    public Results findByIdAll(Integer shopOrderId);

    /**
     *  查询所有商品兑换状态
     * @param shop_status   商品兑换状态(0待审核 1通过 2 不通过（返还积分）
     * @return
     */
    public Results findByStatusAll(Integer shop_status);

    /**
     * 查询所有
     * @return
     */
    public Results findAllShopOrder();

    /**
     *  商品兑换审核通过
     * @param shopOrderId   商品兑换订单id
     * @return
     */
    public Results auditShopOrder(Integer shopOrderId);

    /**
     *  商品审核不通过
     * @param shopOrderId
     * @return
     */
    public Results auditNoShopOrder(Integer shopOrderId);

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    public Results findByUserId(Integer userId);

    /**
     * 分页查询
     */
    public PageResult findPage(int page, int size);

    /**
     * 删除
     */
    public Results delShopOrder(Integer[] shopOrderId);

    /**
     *  根据商品兑换订单号查询
     * @param shopOrderNum   商品兑换订单号
     * @return
     */
    public Results findByShopOrderNum(String shopOrderNum);

    /**
     *  根据商品兑换码查询
     * @param shopCdk   商品兑换码
     * @return
     */
    public Results findByShopCdk(String shopCdk);

    /**
     *  根据商品兑换时间查询
     * @param shopOrderDate   商品兑换时间
     * @return
     */
    public Results findByShopOrderDate(Long shopOrderDate);
}
