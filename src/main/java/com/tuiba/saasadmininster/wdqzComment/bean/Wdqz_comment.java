package com.tuiba.saasadmininster.wdqzComment.bean;

import java.io.Serializable;

public class Wdqz_comment implements Serializable {
    private Integer wdqzCommentId;

    private Integer userId;

    private Integer wdqzId;

    private String wdqzCommentContent;

    private Long wqdzCommentDate;

    private Integer wqdzCommentTypeId;

    private Integer wdqzCommentStatus;

    private Long wdqzCommentStatusTime;

    private String bak1;

    public Integer getWdqzCommentId() {
        return wdqzCommentId;
    }

    public void setWdqzCommentId(Integer wdqzCommentId) {
        this.wdqzCommentId = wdqzCommentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWdqzId() {
        return wdqzId;
    }

    public void setWdqzId(Integer wdqzId) {
        this.wdqzId = wdqzId;
    }

    public String getWdqzCommentContent() {
        return wdqzCommentContent;
    }

    public void setWdqzCommentContent(String wdqzCommentContent) {
        this.wdqzCommentContent = wdqzCommentContent == null ? null : wdqzCommentContent.trim();
    }

    public Long getWqdzCommentDate() {
        return wqdzCommentDate;
    }

    public void setWqdzCommentDate(Long wqdzCommentDate) {
        this.wqdzCommentDate = wqdzCommentDate;
    }

    public Integer getWqdzCommentTypeId() {
        return wqdzCommentTypeId;
    }

    public void setWqdzCommentTypeId(Integer wqdzCommentTypeId) {
        this.wqdzCommentTypeId = wqdzCommentTypeId;
    }

    public Integer getWdqzCommentStatus() {
        return wdqzCommentStatus;
    }

    public void setWdqzCommentStatus(Integer wdqzCommentStatus) {
        this.wdqzCommentStatus = wdqzCommentStatus;
    }

    public Long getWdqzCommentStatusTime() {
        return wdqzCommentStatusTime;
    }

    public void setWdqzCommentStatusTime(Long wdqzCommentStatusTime) {
        this.wdqzCommentStatusTime = wdqzCommentStatusTime;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }
}