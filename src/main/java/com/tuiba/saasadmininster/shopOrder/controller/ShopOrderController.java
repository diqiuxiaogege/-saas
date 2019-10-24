package com.tuiba.saasadmininster.shopOrder.controller;

import com.tuiba.saasadmininster.Exception.ResultUtil;
import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.entity.PageResult;
import com.tuiba.saasadmininster.shopOrder.bean.ShopOrder;
import com.tuiba.saasadmininster.shopOrder.service.ShopOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author : yangzhi
 * @date : 11:49 2019/10/16
 */
@RestController
@RequestMapping(value = "shopOrder")
public class ShopOrderController {

    @Autowired
    private ShopOrderService shopOrderService;

    /**
     * 添加兑换商品信息
     *
     * @param shopOrder
     * @return
     */

    /**
     * showdoc
     *
     * @param shopOrder 必选     商品实体
     *                  * @return {   "code": 200,"msg": "成功","data": {"shopOrderId": 1,"shoShopId": 2,"userId": 3,"shopOrderNum": "333","shopCdk": "4","shopOrderDate": null,"shopOrderScore": null,"shopStatus": 0,"shopShenheTime": null,"bak1": null}}
     * @catalog SAAS/商城兑换模块-杨志-后
     * @title 保存商品兑换信息
     * @description 用户保存商品兑换信息的接口
     * @method post
     * @url /shopOrder/saveShopOrder
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param shopOrderId int 商品兑换订单id
     * @return_param shoShopId int 商城商品ID
     * @return_param userId int 用户id
     * @return_param shopOrderNum varchar 商品兑换订单号
     * @return_param shopCdk varchar 商品兑换码
     * @return_param shopOrderDate bigint 商品兑换时间
     * @return_param shopOrderScore int 商品兑换所消耗的积分
     * @return_param shopStatus int 商品兑换状态(0待审核 1通过 2 不通过（返还积分）
     * @return_param shopShenheTime bigint 商品审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/saveShopOrder")
    public Results saveShopOrder(@RequestBody ShopOrder shopOrder) {
        return shopOrderService.saveShopOrder(shopOrder);
    }


    /**
     * 根据id查询
     *
     * @param shop_id
     * @return
     */
    /**
     * showdoc
     *
     * @param shopOrderId 必选 int 商品ID
     *                    * @return {  "code": 200,"msg": "成功","data": {"shopOrderId": 1,"shoShopId": 2,"userId": 3,"shopOrderNum": "333","shopCdk": "4","shopOrderDate": null,"shopOrderScore": null,"shopStatus": 0,"shopShenheTime": null,"bak1": null}}
     * @catalog SAAS/商城兑换模块-杨志-后
     * @title 根据商品兑换ID查询
     * @description 用户根据商品ID兑换查询的接口
     * @method get
     * @url /shopOrder/findByIdAll/{shopOrderId}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param shopOrderId int 商品兑换订单id
     * @return_param shoShopId int 商城商品ID
     * @return_param userId int 用户id
     * @return_param shopOrderNum varchar 商品兑换订单号
     * @return_param shopCdk varchar 商品兑换码
     * @return_param shopOrderDate bigint 商品兑换时间
     * @return_param shopOrderScore int 商品兑换所消耗的积分
     * @return_param shopStatus int 商品兑换状态(0待审核 1通过 2 不通过（返还积分）
     * @return_param shopShenheTime bigint 商品审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByIdAll/{shopOrderId}")
    public Results findByIdAll(@PathVariable Integer shopOrderId) {
        return shopOrderService.findByIdAll(shopOrderId);

    }

    /**
     * 查询所有商品兑换状态
     *
     * @param shop_status 商品兑换状态(0待审核 1通过 2 不通过（返还积分）
     * @return
     */
    /**
     * showdoc
     *
     * @param shop_status 必选 int 商品兑换状态
     *                    * @return {  "code": 200,"msg": "成功","data": {"shopOrderId": 1,"shoShopId": 2,"userId": 3,"shopOrderNum": "333","shopCdk": "4","shopOrderDate": null,"shopOrderScore": null,"shopStatus": 0,"shopShenheTime": null,"bak1": null}}
     * @catalog SAAS/商城兑换模块-杨志-后
     * @title 根据商品兑换状态查询
     * @description 用户根据商品兑换状态查询的接口
     * @method get
     * @url /shopOrder/findByStatusAll/{shop_status}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param shopOrderId int 商品兑换订单id
     * @return_param shoShopId int 商城商品ID
     * @return_param userId int 用户id
     * @return_param shopOrderNum varchar 商品兑换订单号
     * @return_param shopCdk varchar 商品兑换码
     * @return_param shopOrderDate bigint 商品兑换时间
     * @return_param shopOrderScore int 商品兑换所消耗的积分
     * @return_param shopStatus int 商品兑换状态(0待审核 1通过 2 不通过（返还积分）
     * @return_param shopShenheTime bigint 商品审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByStatusAll/{shop_status}")
    public Results findByStatusAll(Integer shop_status) {
        return shopOrderService.findByStatusAll(shop_status);
    }

    /**
     * 查询所有
     *
     * @return
     */
    /**
     * showdoc
     * <p>
     * * @return {  "code": 200,"msg": "成功","data": {"shopOrderId": 1,"shoShopId": 2,"userId": 3,"shopOrderNum": "333","shopCdk": "4","shopOrderDate": null,"shopOrderScore": null,"shopStatus": 0,"shopShenheTime": null,"bak1": null}}
     *
     * @catalog SAAS/商城兑换模块-杨志-后
     * @title 查询所有
     * @description 用户查询所有的接口
     * @method get
     * @url /shopOrder/findByStatusAll/{shop_status}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param shopOrderId int 商品兑换订单id
     * @return_param shoShopId int 商城商品ID
     * @return_param userId int 用户id
     * @return_param shopOrderNum varchar 商品兑换订单号
     * @return_param shopCdk varchar 商品兑换码
     * @return_param shopOrderDate bigint 商品兑换时间
     * @return_param shopOrderScore int 商品兑换所消耗的积分
     * @return_param shopStatus int 商品兑换状态(0待审核 1通过 2 不通过（返还积分）
     * @return_param shopShenheTime bigint 商品审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findAllShopOrder")
    public Results findAllShopOrder() {
        return shopOrderService.findAllShopOrder();
    }

    /**
     * 商品兑换审核通过
     * @param map
     * @return
     */

    /**
     * showdoc
     *
     * @param shopOrderId 必选 int 商品兑换状态
     *                    <p>
     *                    * @return {  "code": 200,"msg": "成功","data": {"shopOrderId": 1,"shoShopId": 2,"userId": 3,"shopOrderNum": "333","shopCdk": "4","shopOrderDate": null,"shopOrderScore": null,"shopStatus": 1,"shopShenheTime": null,"bak1": null}}
     * @catalog SAAS/商城兑换模块-杨志-后
     * @title 商品兑换审核通过
     * @description 用户商品兑换审核通过的接口
     * @method post
     * @url /shopOrder/auditShopOrder
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param shopOrderId int 商品兑换订单id
     * @return_param shoShopId int 商城商品ID
     * @return_param userId int 用户id
     * @return_param shopOrderNum varchar 商品兑换订单号
     * @return_param shopCdk varchar 商品兑换码
     * @return_param shopOrderDate bigint 商品兑换时间
     * @return_param shopOrderScore int 商品兑换所消耗的积分
     * @return_param shopStatus int 商品兑换状态(0待审核 1通过 2 不通过（返还积分）
     * @return_param shopShenheTime bigint 商品审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/auditShopOrder")
    public Results auditShopOrder(@RequestBody Map<String, Integer> map) {
        Integer shopOrderId = map.get("shopOrderId");
        return shopOrderService.auditShopOrder(shopOrderId);

    }

    /**
     * 商品兑换审核不通过
     *
     * @param map
     * @return
     */
    /**
     * showdoc
     *
     * @param shopOrderId 必选 int 商品兑换状态
     *                    <p>
     *                    * @return {  "code": 200,"msg": "成功","data": {"shopOrderId": 1,"shoShopId": 2,"userId": 3,"shopOrderNum": "333","shopCdk": "4","shopOrderDate": null,"shopOrderScore": null,"shopStatus": 0,"shopShenheTime": null,"bak1": null}}
     * @catalog SAAS/商城兑换模块-杨志-后
     * @title 商品兑换审核不通过
     * @description 用户商品兑换审核不通过的接口
     * @method post
     * @url /shopOrder/auditNoShopOrder
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param shopOrderId int 商品兑换订单id
     * @return_param shoShopId int 商城商品ID
     * @return_param userId int 用户id
     * @return_param shopOrderNum varchar 商品兑换订单号
     * @return_param shopCdk varchar 商品兑换码
     * @return_param shopOrderDate bigint 商品兑换时间
     * @return_param shopOrderScore int 商品兑换所消耗的积分
     * @return_param shopStatus int 商品兑换状态(0待审核 1通过 2 不通过（返还积分）
     * @return_param shopShenheTime bigint 商品审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @PostMapping(value = "/auditNoShopOrder")
    public Results auditNoShopOrder(@RequestBody Map<String, Integer> map) {
        Integer shopOrderId = map.get("shopOrderId");
        return shopOrderService.auditNoShopOrder(shopOrderId);
    }

    /**
     * 根据用户id查询
     *
     * @param userId
     * @return
     */
    /**
     * showdoc
     *
     * @param userId 必选 int 用户id
     *               <p>
     *               * @return {  "code": 200,"msg": "成功","data": {"shopOrderId": 1,"shoShopId": 2,"userId": 3,"shopOrderNum": "333","shopCdk": "4","shopOrderDate": null,"shopOrderScore": null,"shopStatus": 0,"shopShenheTime": null,"bak1": null}}
     * @catalog SAAS/商城兑换模块-杨志-后
     * @title 根据用户id查询
     * @description 用户根据用户id查询的接口
     * @method get
     * @url /shopOrder/findByUserId/{userId}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param shopOrderId int 商品兑换订单id
     * @return_param shoShopId int 商城商品ID
     * @return_param userId int 用户id
     * @return_param shopOrderNum varchar 商品兑换订单号
     * @return_param shopCdk varchar 商品兑换码
     * @return_param shopOrderDate bigint 商品兑换时间
     * @return_param shopOrderScore int 商品兑换所消耗的积分
     * @return_param shopStatus int 商品兑换状态(0待审核 1通过 2 不通过（返还积分）
     * @return_param shopShenheTime bigint 商品审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByUserId/{userId}")
    public Results findByUserId(@PathVariable Integer userId) {
        return shopOrderService.findByUserId(userId);
    }

    /**
     * 分页查询
     */
    /**
     * showdoc
     *
     * @param page 必选 int 当前页
     * @param page 必选 int 当前页条数
     *             * @return {  "code": 200,"msg": "成功","data": {"shopOrderId": 1,"shoShopId": 2,"userId": 3,"shopOrderNum": "333","shopCdk": "4","shopOrderDate": null,"shopOrderScore": null,"shopStatus": 0,"shopShenheTime": null,"bak1": null}}
     * @catalog SAAS/商城兑换模块-杨志-后
     * @title 分页查询
     * @description 用户分页查询的接口
     * @method get
     * @url /shopOrder/findPage/{page}/{size}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param shopOrderId int 商品兑换订单id
     * @return_param shoShopId int 商城商品ID
     * @return_param userId int 用户id
     * @return_param shopOrderNum varchar 商品兑换订单号
     * @return_param shopCdk varchar 商品兑换码
     * @return_param shopOrderDate bigint 商品兑换时间
     * @return_param shopOrderScore int 商品兑换所消耗的积分
     * @return_param shopStatus int 商品兑换状态(0待审核 1通过 2 不通过（返还积分）
     * @return_param shopShenheTime bigint 商品审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findPage/{page}/{size}")
    public Results findPage(@PathVariable int page, @PathVariable int size) {
        PageResult page1 = shopOrderService.findPage(page, size);
        return ResultUtil.successce(page1);
    }

    /**
     * 删除
     * @param map
     * @return
     */
    /**
     * showdoc
     *
     * @param page 必选 int 当前页
     * @param page 必选 int 当前页条数
     *             * @return {  "code": 200,"msg": "成功","data": {"操作成功！"}}
     * @catalog SAAS/商城兑换模块-杨志-后
     * @title 删除
     * @description 用户删除的接口
     * @method @DeleteMapping
     * @url /shopOrder/delShopOrder
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param shopOrderId int 商品兑换订单id
     * @return_param shoShopId int 商城商品ID
     * @return_param userId int 用户id
     * @return_param shopOrderNum varchar 商品兑换订单号
     * @return_param shopCdk varchar 商品兑换码
     * @return_param shopOrderDate bigint 商品兑换时间
     * @return_param shopOrderScore int 商品兑换所消耗的积分
     * @return_param shopStatus int 商品兑换状态(0待审核 1通过 2 不通过（返还积分）
     * @return_param shopShenheTime bigint 商品审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @DeleteMapping("/delShopOrder")
    public Results delShopOrder(@RequestBody Map<String, Integer[]> map) {
        Integer[] shopOrderIds = map.get("shopOrderId");
        return shopOrderService.delShopOrder(shopOrderIds);
    }

    /**
     * 商品兑换订单号查询
     *
     * @param userId
     * @return
     */
    /**
     * showdoc
     *
     * @param shopOrderNum 必选 String 商品兑换订单号
     *                     <p>
     *                     * @return {  "code": 200,"msg": "成功","data": {"shopOrderId": 1,"shoShopId": 2,"userId": 3,"shopOrderNum": "333","shopCdk": "4","shopOrderDate": null,"shopOrderScore": null,"shopStatus": 0,"shopShenheTime": null,"bak1": null}}
     * @catalog SAAS/商城兑换模块-杨志-后
     * @title 根据商品兑换订单号查询
     * @description 用户商品兑换订单号查询的接口
     * @method get
     * @url /shopOrder/findByshopOrderNum/{shopOrderNum}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param shopOrderId int 商品兑换订单id
     * @return_param shoShopId int 商城商品ID
     * @return_param userId int 用户id
     * @return_param shopOrderNum varchar 商品兑换订单号
     * @return_param shopCdk varchar 商品兑换码
     * @return_param shopOrderDate bigint 商品兑换时间
     * @return_param shopOrderScore int 商品兑换所消耗的积分
     * @return_param shopStatus int 商品兑换状态(0待审核 1通过 2 不通过（返还积分）
     * @return_param shopShenheTime bigint 商品审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByshopOrderNum/{shopOrderNum}")
    public Results findByshopOrderNum(@PathVariable String shopOrderNum) {
        return shopOrderService.findByShopOrderNum(shopOrderNum);
    }

    /**
     * 商品兑换码查询
     *
     * @param userId
     * @return
     */
    /**
     * showdoc
     *
     * @param shopCdk 必选 String 商品兑换码
     *                <p>
     *                * @return {  "code": 200,"msg": "成功","data": {"shopOrderId": 1,"shoShopId": 2,"userId": 3,"shopOrderNum": "333","shopCdk": "4","shopOrderDate": null,"shopOrderScore": null,"shopStatus": 0,"shopShenheTime": null,"bak1": null}}
     * @catalog SAAS/商城兑换模块-杨志-后
     * @title 根据商品兑换码查询
     * @description 用户商品兑换码查询的接口
     * @method get
     * @url     /shopOrder/findByShopCdk/{shopCdk}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param shopOrderId int 商品兑换订单id
     * @return_param shoShopId int 商城商品ID
     * @return_param userId int 用户id
     * @return_param shopOrderNum varchar 商品兑换订单号
     * @return_param shopCdk varchar 商品兑换码
     * @return_param shopOrderDate bigint 商品兑换时间
     * @return_param shopOrderScore int 商品兑换所消耗的积分
     * @return_param shopStatus int 商品兑换状态(0待审核 1通过 2 不通过（返还积分）
     * @return_param shopShenheTime bigint 商品审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByShopCdk/{shopCdk}")
    public Results findByShopCdk(@PathVariable String shopCdk) {
        return shopOrderService.findByShopCdk(shopCdk);
    }

    /**
     * 商品兑换时间查询
     *
     * @param userId
     * @return
     */
    /**
     * showdoc
     *
     * @param shopOrderDate 必选 Long 商品兑换时间
     *                <p>
     *         * @return {  "code": 200,"msg": "成功","data": {"shopOrderId": 1,"shoShopId": 2,"userId": 3,"shopOrderNum": "333","shopCdk": "4","shopOrderDate": null,"shopOrderScore": null,"shopStatus": 0,"shopShenheTime": null,"bak1": null}}
     * @catalog SAAS/商城兑换模块-杨志-后
     * @title 根据商品兑换时间查询
     * @description 用户商品兑换时间查询的接口
     * @method get
     * @url     /shopOrder/findByShopOrderDate/{shopOrderDate}
     * @return_param code int 返回状态码
     * @return_param msg string 返回状态码提示
     * @return_param data json 返回数据
     * @return_param shopOrderId int 商品兑换订单id
     * @return_param shoShopId int 商城商品ID
     * @return_param userId int 用户id
     * @return_param shopOrderNum varchar 商品兑换订单号
     * @return_param shopCdk varchar 商品兑换码
     * @return_param shopOrderDate bigint 商品兑换时间
     * @return_param shopOrderScore int 商品兑换所消耗的积分
     * @return_param shopStatus int 商品兑换状态(0待审核 1通过 2 不通过（返还积分）
     * @return_param shopShenheTime bigint 商品审核时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     */
    @GetMapping(value = "/findByShopOrderDate/{shopOrderDate}")
    public Results findByShopOrderDate(@PathVariable Long shopOrderDate) {
        return shopOrderService.findByShopOrderDate(shopOrderDate);
    }
}
