package com.tuiba.saasadmininster.xxfx.bean;

import java.io.Serializable;

public class Xxfx implements Serializable {
    private Integer xxfxId;

    private Integer userId;

    private Integer forumId;

    private String xxfxTitle;

    private String xxfxContent;

    private String xxfxProductType;

    private Integer xxfxDianzan;

    private Long xxfxTime;

    private Long xxfxModifyTime;

    private Integer xxfxStatus;

    private Long xxfxTopTime;

    private Long xxfxCanceTopTime;

    private String bak1;

    public Integer getXxfxId() {
        return xxfxId;
    }

    public void setXxfxId(Integer xxfxId) {
        this.xxfxId = xxfxId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    public String getXxfxTitle() {
        return xxfxTitle;
    }

    public void setXxfxTitle(String xxfxTitle) {
        this.xxfxTitle = xxfxTitle == null ? null : xxfxTitle.trim();
    }

    public String getXxfxContent() {
        return xxfxContent;
    }

    public void setXxfxContent(String xxfxContent) {
        this.xxfxContent = xxfxContent == null ? null : xxfxContent.trim();
    }

    public String getXxfxProductType() {
        return xxfxProductType;
    }

    public void setXxfxProductType(String xxfxProductType) {
        this.xxfxProductType = xxfxProductType == null ? null : xxfxProductType.trim();
    }

    public Integer getXxfxDianzan() {
        return xxfxDianzan;
    }

    public void setXxfxDianzan(Integer xxfxDianzan) {
        this.xxfxDianzan = xxfxDianzan;
    }

    public Long getXxfxTime() {
        return xxfxTime;
    }

    public void setXxfxTime(Long xxfxTime) {
        this.xxfxTime = xxfxTime;
    }

    public Long getXxfxModifyTime() {
        return xxfxModifyTime;
    }

    public void setXxfxModifyTime(Long xxfxModifyTime) {
        this.xxfxModifyTime = xxfxModifyTime;
    }

    public Integer getXxfxStatus() {
        return xxfxStatus;
    }

    public void setXxfxStatus(Integer xxfxStatus) {
        this.xxfxStatus = xxfxStatus;
    }

    public Long getXxfxTopTime() {
        return xxfxTopTime;
    }

    public void setXxfxTopTime(Long xxfxTopTime) {
        this.xxfxTopTime = xxfxTopTime;
    }

    public Long getXxfxCanceTopTime() {
        return xxfxCanceTopTime;
    }

    public void setXxfxCanceTopTime(Long xxfxCanceTopTime) {
        this.xxfxCanceTopTime = xxfxCanceTopTime;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }
}