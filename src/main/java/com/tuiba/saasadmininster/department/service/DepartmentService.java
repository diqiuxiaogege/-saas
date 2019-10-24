package com.tuiba.saasadmininster.department.service;

import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.department.bean.Department;
import com.tuiba.saasadmininster.entity.PageResult;


public interface DepartmentService {

    /**
     * 添加部门
     *
     * @param departmentName      部门名称
     * @param departmentPrincipal 部门负责人
     * @param departmentBind      部门关系
     */
    public Results addDepartment(String departmentName, String departmentPrincipal, Integer departmentBind);


    /**
     * 查看部门
     */

    public Results findAllDepartment();

    /**
     * 编辑部门
     */
    public Results updateDepartment(Department department);

   /* *//**
     * 删除部门
     *//*
    public Result delDepartment(Integer[] department_id);
*/
    /**
     * 删除部门
     */
    public Results delDepartment(Integer[] department_id);

    /**
     * 分页查询
     */
    public PageResult findPage(int page, int size);

    /**
     * 根据id查询部门
     */
    public Results getDepartmentAll(Integer department_id);
}
