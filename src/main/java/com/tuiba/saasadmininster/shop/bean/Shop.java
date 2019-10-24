package com.tuiba.saasadmininster.shop.bean;

import java.io.Serializable;


public class Shop implements Serializable{
    // 商品id
    private Integer shopId;

    //  商品名称
    private String shopName;

    //  商品库存数量
    private Integer shopNum;

    //  商品兑换所需积分
    private Integer shopScore;

    //  商品添加时间
    private Long shopAddDate;

    //  商品修改时间
    private Long shopModifyDate;

    //  商品图片
    private String shopImg;

    //  商品描述
    private String shopMiaoshu;

    //  商品状态    0：上架  1：下架
    private Integer shopStatus;

    //  商品删除状态  0：正常  1：删除
    private Integer shopDeleteType;

    //  预留字段
    private String bak1;

    //  商品详情
    private String shopXiangqing;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Integer getShopNum() {
        return shopNum;
    }

    public void setShopNum(Integer shopNum) {
        this.shopNum = shopNum;
    }

    public Integer getShopScore() {
        return shopScore;
    }

    public void setShopScore(Integer shopScore) {
        this.shopScore = shopScore;
    }

    public Long getShopAddDate() {
        return shopAddDate;
    }

    public void setShopAddDate(Long shopAddDate) {
        this.shopAddDate = shopAddDate;
    }

    public Long getShopModifyDate() {
        return shopModifyDate;
    }

    public void setShopModifyDate(Long shopModifyDate) {
        this.shopModifyDate = shopModifyDate;
    }

    public String getShopImg() {
        return shopImg;
    }

    public void setShopImg(String shopImg) {
        this.shopImg = shopImg == null ? null : shopImg.trim();
    }

    public String getShopMiaoshu() {
        return shopMiaoshu;
    }

    public void setShopMiaoshu(String shopMiaoshu) {
        this.shopMiaoshu = shopMiaoshu == null ? null : shopMiaoshu.trim();
    }

    public Integer getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(Integer shopStatus) {
        this.shopStatus = shopStatus;
    }

    public Integer getShopDeleteType() {
        return shopDeleteType;
    }

    public void setShopDeleteType(Integer shopDeleteType) {
        this.shopDeleteType = shopDeleteType;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }

    public String getShopXiangqing() {
        return shopXiangqing;
    }

    public void setShopXiangqing(String shopXiangqing) {
        this.shopXiangqing = shopXiangqing == null ? null : shopXiangqing.trim();
    }
}