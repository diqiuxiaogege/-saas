package com.tuiba.saasadmininster.system.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 部门
 */
@Data
@TableName("department")
public class Department implements Serializable {
    //  序列化id
    private static final Long serialVersionUID = -5117912019617438671L;

    //  部门id
    @TableId (value = "department_id", type =IdType.AUTO)
    private Long departmentId;

    //  部门名称
    @TableField("department_name")
    private String departmentName;

    //  部门负责人
    @TableField("department_principal")
    private String departmentPrincipal;

    //  部门关系
    @TableField("department_bind")
    private Long departmentBind;

    //  部门添加时间
    @TableField("department_add_time")
    private Long departmentAddTime;

    //  部门修改时间
    @TableField("department_modify_time")
    private Long departmentModifyTime;

    //  预留字段
    @TableField("bak1")
    private Long bak1;


}
