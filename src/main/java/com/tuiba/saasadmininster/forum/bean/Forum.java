package com.tuiba.saasadmininster.forum.bean;


import java.io.Serializable;

public class Forum implements Serializable{
    private Integer forumId;

    private String forumName;

    private Long forumDate;

    private Long forumModifyDate;

    private Integer forumType;

    private Integer productId;

    private String bak1;

    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    public String getForumName() {
        return forumName;
    }

    public void setForumName(String forumName) {
        this.forumName = forumName == null ? null : forumName.trim();
    }

    public Long getForumDate() {
        return forumDate;
    }

    public void setForumDate(Long forumDate) {
        this.forumDate = forumDate;
    }

    public Long getForumModifyDate() {
        return forumModifyDate;
    }

    public void setForumModifyDate(Long forumModifyDate) {
        this.forumModifyDate = forumModifyDate;
    }

    public Integer getForumType() {
        return forumType;
    }

    public void setForumType(Integer forumType) {
        this.forumType = forumType;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }
}