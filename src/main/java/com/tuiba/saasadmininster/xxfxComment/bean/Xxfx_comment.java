package com.tuiba.saasadmininster.xxfxComment.bean;

import java.io.Serializable;

public class Xxfx_comment implements Serializable {
    private Integer xxfxCommentId;

    private Integer userId;

    private Integer xxfxId;

    private Integer xxfxCommentTypeId;

    private Long xxfxCommentDate;

    private Integer xxfxCommentStatus;

    private Long xxfxCommentStatusTime;

    private String bak1;

    private String xxfxCommentContent;

    public Integer getXxfxCommentId() {
        return xxfxCommentId;
    }

    public void setXxfxCommentId(Integer xxfxCommentId) {
        this.xxfxCommentId = xxfxCommentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getXxfxId() {
        return xxfxId;
    }

    public void setXxfxId(Integer xxfxId) {
        this.xxfxId = xxfxId;
    }

    public Integer getXxfxCommentTypeId() {
        return xxfxCommentTypeId;
    }

    public void setXxfxCommentTypeId(Integer xxfxCommentTypeId) {
        this.xxfxCommentTypeId = xxfxCommentTypeId;
    }

    public Long getXxfxCommentDate() {
        return xxfxCommentDate;
    }

    public void setXxfxCommentDate(Long xxfxCommentDate) {
        this.xxfxCommentDate = xxfxCommentDate;
    }

    public Integer getXxfxCommentStatus() {
        return xxfxCommentStatus;
    }

    public void setXxfxCommentStatus(Integer xxfxCommentStatus) {
        this.xxfxCommentStatus = xxfxCommentStatus;
    }

    public Long getXxfxCommentStatusTime() {
        return xxfxCommentStatusTime;
    }

    public void setXxfxCommentStatusTime(Long xxfxCommentStatusTime) {
        this.xxfxCommentStatusTime = xxfxCommentStatusTime;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }

    public String getXxfxCommentContent() {
        return xxfxCommentContent;
    }

    public void setXxfxCommentContent(String xxfxCommentContent) {
        this.xxfxCommentContent = xxfxCommentContent == null ? null : xxfxCommentContent.trim();
    }
}