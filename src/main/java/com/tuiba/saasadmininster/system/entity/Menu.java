package com.tuiba.saasadmininster.system.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 功能
 */
@Data
@TableName("menu")
public class Menu implements Serializable {

    private static final long serialVersionUID = 4814736473750871872L;
    // 菜单
    public static final String TYPE_MENU = "0";
    // 按钮
    public static final String TYPE_BUTTON = "1";

    public static final Long TOP_NODE = 0L;

    //    自增id
    @TableId(value = "menu_id", type = IdType.AUTO)
    private Long menuId;

    //    模块id
    @TableField("module_id")
    private Long moduleId;
    //    上级菜单id
    @TableField("parent_id")
    private Long parentId;

    //    功能/按钮名称
    @TableField("menu_name")
    private String menuName;

    //    功能路径
    @TableField("url")
    private String url;

    //    权限标识
    @TableField("perms")
    private String perms;

    //    图标
    @TableField("icon")
    private String icon;

    //    功能类型
    @TableField("type")
    private String type;

    //    排序
    @TableField("order_num")
    private Long orderNum;

    //    创建时间
    @TableField("create_time")
    private Long createTime;

    //    修改时间
    @TableField("modify_time")
    private Long modifyTime;


}
