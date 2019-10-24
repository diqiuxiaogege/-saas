package com.tuiba.saasadmininster.system.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 角色id
 */
@Data
@TableName("role")
public class Role implements Serializable {

    private static final long serialVersionUID = -1016285285350546379L;

    //  角色id
    @TableId(value = "role_id", type = IdType.AUTO)
    private Long roleId;

    //  角色名称
    @TableField("role_name")
    private String roleName;

    //  角色描述
    @TableField("remark")
    private String remark;

    //  角色添加时间
    @TableField("create_time")
    private Long createTime;

    @TableField("modify_time")
    //  角色修改时间
    private Long modifyTime;

    //   预留字段
    @TableField("bak1")
    private String bak1;

    //  菜单id
    @TableField(exist = false)
    private String menuIds;


}
