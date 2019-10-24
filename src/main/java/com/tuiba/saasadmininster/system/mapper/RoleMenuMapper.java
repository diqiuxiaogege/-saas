package com.tuiba.saasadmininster.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tuiba.saasadmininster.system.entity.RoleMenu;

/**
 * 权限菜单
 */
public interface RoleMenuMapper extends BaseMapper<RoleMenu> {
    /**
     * 递归删除菜单/按钮
     *
     * @param menuId menuId
     */
    void deleteRoleMenus(String menuId);
}
