package com.tuiba.saasadmininster.system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 角色对应的功能
 */
@Data
@TableName("role_menu")
public class RoleMenu implements Serializable {

    private static final long serialVersionUID = 7904105841063590694L;

    //    角色id
    @TableField("role_id")
    @NotNull(message = "角色id不能空")
    private Long roleId;

    //    功能id
    @TableField("menu_id")
    @NotNull(message = "功能id不能为空")
    private Long menuId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }


    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

}
