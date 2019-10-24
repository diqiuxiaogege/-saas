package com.tuiba.saasadmininster.department.controller;


import com.tuiba.saasadmininster.Exception.ResultUtil;
import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.department.bean.Department;
import com.tuiba.saasadmininster.department.service.DepartmentService;
import com.tuiba.saasadmininster.entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/saas")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    /**
     * 增加部门
     * @return departmentName（部门名称）    departmentPrincipal（部门负责人）  departmentBind（部门关系）
     */

    /**
     * showdoc
     * @catalog 测试文档/部门相关
     * @title 增加部门
     * @description 用户增加的接口
     * @method post
     * @url /saas/addDepartment
     * @param departmentName      必选 String 部门名称
     * @param departmentPrincipal 必选 String 部门负责人
     * @param departmentBind      必选 int 部门关系
     * @return {"code":200,"msg":"成功","data":{"departmentId":"null","departmentName":"开发部","departmentPrincipal":"张三","departmentBind":3,"departmentAddTime":"1571647807175","departmentModifyTime":"null","bak1":"null"}}
     * @return_param department_name String 部门名称
     * @return_param department_principal string 部门负责人
     * @return_param department_bind int 部门关系
     * @remark 备注信息
     *
     */
    @PostMapping(value = "/addDepartment")
    public Results addDepartment(@RequestBody Map<String, Object> map) {

        return departmentService.addDepartment((String) map.get("departmentName"), (String) map.get("departmentPrincipal"), (Integer) map.get("departmentBind"));

    }

    /**
     * 查看部门
     *
     * @return
     */
    /**
     * showdoc
     * @catalog 测试文档/部门相关
     * @title 查看部门
     * @description 用户查看所有的接口
     * @method get
     * @url /saas/findAllDepartment
     * @return {"code":200,"msg":"成功","data":[{"departmentId":6,"departmentName":"开发部","departmentPrincipal":"张三","departmentBind":3,"departmentAddTime":"1571647298903","departmentModifyTime":"null","bak1":"null"},{"departmentId":7,"departmentName":"开发部","departmentPrincipal":"张三","departmentBind":3,"departmentAddTime":"1571647739838","departmentModifyTime":"null","bak1":"null"}}]
     * @return_param department_name String 部门名称
     * @return_param department_principal string 部门负责人
     * @return_param department_bind int 部门关系
     * @return_param departmentAddTime bigint 添加时间
     * @return_param departmentModifyTime bigint 修改时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     *
     */
    @GetMapping(value = "/findAllDepartment")
    public Results findAllDepartment() {
        return departmentService.findAllDepartment();
    }

    /**
     * 编辑部门
     */
    /**
     * showdoc
     * @catalog 测试文档/部门相关
     * @title 编辑部门
     * @description 用户编辑部门的接口
     * @method post
     * @url /saas/updateDepartment
     * * @return {"code":200,"msg":"成功","data":{"departmentId":"3","departmentName":"销售部","departmentPrincipal":"李四","departmentBind":5,"departmentAddTime":"1571647761511","departmentModifyTime":"1571649943144","bak1":"null"}}
     * @return_param departmentName String 部门名称
     * @return_param departmentPrincipal string 部门负责人
     * @return_param department_bind int 部门关系
     * @return_param departmentAddTime bigint 添加时间
     * @return_param departmentModifyTime bigint 修改时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     *
     */
    @PostMapping(value = "/updateDepartment")
    public Results updateDepartment(@RequestBody Department department) {
        return departmentService.updateDepartment(department);
    }

    /* *//**
     * 删除部门
     *//*
    @DeleteMapping(value = "/delDepartment")
    public Result delDepartment(@RequestBody Map<String, Integer[]> map) {
        Integer[] department_ids = map.get("ddepartment_id");
        return departmentService.delDepartment(department_ids);

    }
*/

    /**
     * 删除部门
     */
    /**
     * showdoc
     * @catalog 测试文档/部门相关
     * @title 删除部门
     * @description 用户删除批量删除或单个删除的接口
     * @method delete
     * @url /saas/delDepartment
     * @param department_id      必选 int 部门ID
     * * @return {  "code": 200,"msg": "成功","data": {"操作成功！"}}
     * @return_param departmentName String 部门名称
     * @return_param departmentPrincipal string 部门负责人
     * @return_param department_bind int 部门关系
     * @return_param departmentAddTime bigint 添加时间
     * @return_param departmentModifyTime bigint 修改时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     *
     */
    @DeleteMapping(value = "/delDepartment")
    public Results delDepartment(@RequestBody Map<String, Integer[]> map) {
        Integer[] department_ids = map.get("department_id");
        return departmentService.delDepartment(department_ids);

    }

    /**
     * 分页查询
     */

    /**
     * showdoc
     * @catalog 测试文档/部门相关
     * @title 分页查询
     * @description 用户分页查询的接口
     * @method get
     * @url /saas/findPage/{page}/{size}
     * @param page      必选 int 当前页
     * @param page      必选 int 当前页条数
     * * @return {  "code": 200,"msg": "成功","data": {"total": 4,"rows": [{"departmentId": 6,"departmentName": "开发部","departmentPrincipal": "张三","departmentBind": 3,"departmentAddTime": 1571647298903,"departmentModifyTime": null,"bak1": null},{"departmentId": 7,"departmentName": "开发部","departmentPrincipal": "张三","departmentBind": 3,"departmentAddTime": 1571647739838,"departmentModifyTime": null,"bak1": null}]}}
     * @return_param departmentName String 部门名称
     * @return_param departmentPrincipal string 部门负责人
     * @return_param department_bind int 部门关系
     * @return_param departmentAddTime bigint 添加时间
     * @return_param departmentModifyTime bigint 修改时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     *
     */
    @GetMapping(value = "/findPage/{page}/{size}")
    public Results findPage(@PathVariable int page, @PathVariable int size) {
        PageResult page1 = departmentService.findPage(page, size);
        return ResultUtil.successce(page1);
    }

    /**
     * 根据部门ID查询
     */
    /**
     * showdoc
     * @catalog 测试文档/部门相关
     * @title 根据部门ID查询
     * @description 用户根据部门ID查询的接口
     * @method get
     * @url /saas/getDepartmentAll/{department_id}
     * @param department_id      必选 int 部门ID
     * * @return {  "code": 200,"msg": "成功","data": {"departmentId": 8,"departmentName": "销售部","departmentPrincipal": "李四","departmentBind": 5,"departmentAddTime": 1571647761511,"departmentModifyTime": 1571649943144,"bak1": null}}
     * @return_param departmentName String 部门名称
     * @return_param departmentPrincipal string 部门负责人
     * @return_param department_bind int 部门关系
     * @return_param departmentAddTime bigint 添加时间
     * @return_param departmentModifyTime bigint 修改时间
     * @return_param bak1 bigint 预留字段
     * @remark 备注信息
     *
     */
    @GetMapping(value = "/getDepartmentAll/{department_id}")
    public Results getDepartmentAll(@PathVariable Integer department_id) {
        return departmentService.getDepartmentAll(department_id);
    }
}
