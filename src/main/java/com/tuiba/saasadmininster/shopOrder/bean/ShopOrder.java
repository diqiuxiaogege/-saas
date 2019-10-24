package com.tuiba.saasadmininster.shopOrder.bean;

import java.io.Serializable;

public class ShopOrder implements Serializable{

    //商品兑换订单ID（自增）
    private Integer shopOrderId;

    //商城商品ID
    private Integer shoShopId;

    //员工账户ID
    private Integer userId;

    //商品兑换订单号
    private String shopOrderNum;

    //商品兑换码
    private String shopCdk;

    //商品兑换时间
    private Long shopOrderDate;

    //商品兑换所消耗的积分
    private Integer shopOrderScore;

    //商品兑换状态(0待审核 1通过 2 不通过（返还积分）
    private Integer shopStatus;

    //商品审核时间
    private Long shopShenheTime;

    //预留字段
    private String bak1;

    public Integer getShopOrderId() {
        return shopOrderId;
    }

    public void setShopOrderId(Integer shopOrderId) {
        this.shopOrderId = shopOrderId;
    }

    public Integer getShoShopId() {
        return shoShopId;
    }

    public void setShoShopId(Integer shoShopId) {
        this.shoShopId = shoShopId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getShopOrderNum() {
        return shopOrderNum;
    }

    public void setShopOrderNum(String shopOrderNum) {
        this.shopOrderNum = shopOrderNum == null ? null : shopOrderNum.trim();
    }

    public String getShopCdk() {
        return shopCdk;
    }

    public void setShopCdk(String shopCdk) {
        this.shopCdk = shopCdk == null ? null : shopCdk.trim();
    }

    public Long getShopOrderDate() {
        return shopOrderDate;
    }

    public void setShopOrderDate(Long shopOrderDate) {
        this.shopOrderDate = shopOrderDate;
    }

    public Integer getShopOrderScore() {
        return shopOrderScore;
    }

    public void setShopOrderScore(Integer shopOrderScore) {
        this.shopOrderScore = shopOrderScore;
    }

    public Integer getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(Integer shopStatus) {
        this.shopStatus = shopStatus;
    }

    public Long getShopShenheTime() {
        return shopShenheTime;
    }

    public void setShopShenheTime(Long shopShenheTime) {
        this.shopShenheTime = shopShenheTime;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }
}