package com.tuiba.saasadmininster.department.bean;

import java.io.Serializable;

public class Department implements Serializable {

    /**
     * 部门id
     */
    private Integer departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 部门负责人
     */
    private String departmentPrincipal;

    /**
     * 部门关系
     */
    private Integer departmentBind;

    /**
     * 部门添加时间
     */
    private Long departmentAddTime;

    /**
     * 部门修改时间
     */
    private Long departmentModifyTime;

    /**
     * 预留字段
     */
    private Long bak1;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDepartmentPrincipal() {
        return departmentPrincipal;
    }

    public void setDepartmentPrincipal(String departmentPrincipal) {
        this.departmentPrincipal = departmentPrincipal == null ? null : departmentPrincipal.trim();
    }

    public Integer getDepartmentBind() {
        return departmentBind;
    }

    public void setDepartmentBind(Integer departmentBind) {
        this.departmentBind = departmentBind;
    }

    public Long getDepartmentAddTime() {
        return departmentAddTime;
    }

    public void setDepartmentAddTime(Long departmentAddTime) {
        this.departmentAddTime = departmentAddTime;
    }

    public Long getDepartmentModifyTime() {
        return departmentModifyTime;
    }

    public void setDepartmentModifyTime(Long departmentModifyTime) {
        this.departmentModifyTime = departmentModifyTime;
    }

    public Long getBak1() {
        return bak1;
    }

    public void setBak1(Long bak1) {
        this.bak1 = bak1;
    }
}