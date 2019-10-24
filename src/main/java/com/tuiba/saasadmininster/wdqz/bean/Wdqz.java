package com.tuiba.saasadmininster.wdqz.bean;

import java.io.Serializable;

public class Wdqz implements Serializable{
    private Integer wdqzId;

    private Integer forumId;

    private Integer userId;

    private String wdqzTitle;

    private String wdqzContent;

    private String wdqzImg;

    private String wdqzVoice;

    private String wdqzScore;

    private Integer wdqzDianzan;

    private Long wdqzPublishTime;

    private Long wdqzModifyTime;

    private Integer wdqzAdoption;

    private Integer wdqzStatus;

    private Long wdqzTopTime;

    private Long wdqzCanceTopTime;

    private String bak1;

    public Integer getWdqzId() {
        return wdqzId;
    }

    public void setWdqzId(Integer wdqzId) {
        this.wdqzId = wdqzId;
    }

    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWdqzTitle() {
        return wdqzTitle;
    }

    public void setWdqzTitle(String wdqzTitle) {
        this.wdqzTitle = wdqzTitle == null ? null : wdqzTitle.trim();
    }

    public String getWdqzContent() {
        return wdqzContent;
    }

    public void setWdqzContent(String wdqzContent) {
        this.wdqzContent = wdqzContent == null ? null : wdqzContent.trim();
    }

    public String getWdqzImg() {
        return wdqzImg;
    }

    public void setWdqzImg(String wdqzImg) {
        this.wdqzImg = wdqzImg == null ? null : wdqzImg.trim();
    }

    public String getWdqzVoice() {
        return wdqzVoice;
    }

    public void setWdqzVoice(String wdqzVoice) {
        this.wdqzVoice = wdqzVoice == null ? null : wdqzVoice.trim();
    }

    public String getWdqzScore() {
        return wdqzScore;
    }

    public void setWdqzScore(String wdqzScore) {
        this.wdqzScore = wdqzScore == null ? null : wdqzScore.trim();
    }

    public Integer getWdqzDianzan() {
        return wdqzDianzan;
    }

    public void setWdqzDianzan(Integer wdqzDianzan) {
        this.wdqzDianzan = wdqzDianzan;
    }

    public Long getWdqzPublishTime() {
        return wdqzPublishTime;
    }

    public void setWdqzPublishTime(Long wdqzPublishTime) {
        this.wdqzPublishTime = wdqzPublishTime;
    }

    public Long getWdqzModifyTime() {
        return wdqzModifyTime;
    }

    public void setWdqzModifyTime(Long wdqzModifyTime) {
        this.wdqzModifyTime = wdqzModifyTime;
    }

    public Integer getWdqzAdoption() {
        return wdqzAdoption;
    }

    public void setWdqzAdoption(Integer wdqzAdoption) {
        this.wdqzAdoption = wdqzAdoption;
    }

    public Integer getWdqzStatus() {
        return wdqzStatus;
    }

    public void setWdqzStatus(Integer wdqzStatus) {
        this.wdqzStatus = wdqzStatus;
    }

    public Long getWdqzTopTime() {
        return wdqzTopTime;
    }

    public void setWdqzTopTime(Long wdqzTopTime) {
        this.wdqzTopTime = wdqzTopTime;
    }

    public Long getWdqzCanceTopTime() {
        return wdqzCanceTopTime;
    }

    public void setWdqzCanceTopTime(Long wdqzCanceTopTime) {
        this.wdqzCanceTopTime = wdqzCanceTopTime;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }
}