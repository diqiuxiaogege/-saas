package com.tuiba.saasadmininster.department.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.tuiba.saasadmininster.Exception.MyException;
import com.tuiba.saasadmininster.Exception.ResultEnum;
import com.tuiba.saasadmininster.Exception.ResultUtil;
import com.tuiba.saasadmininster.Exception.Results;
import com.tuiba.saasadmininster.department.bean.Department;
import com.tuiba.saasadmininster.department.dao.DepartmentMapper;
import com.tuiba.saasadmininster.department.service.DepartmentService;
import com.tuiba.saasadmininster.entity.PageResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 部门表
 */
@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 添加部门
     *
     * @param departmentName      部门名称
     * @param departmentPrincipal 部门负责人
     * @param departmentBind      部门关系
     */
    @Override
    public Results addDepartment(String departmentName, String departmentPrincipal, Integer departmentBind) {
        if (departmentName == null || departmentPrincipal == null || departmentBind == 0) {
            throw new MyException(ResultEnum.INVALID_PARAM.getCode(),ResultEnum.INVALID_PARAM.getMsg());
        }
        //创建对象并存入数据库
        Department department = new Department();
        //添加信息
        department.setDepartmentName(departmentName);
        department.setDepartmentPrincipal(departmentPrincipal);
        department.setDepartmentBind(departmentBind);
        department.setDepartmentAddTime(new Date().getTime());     //添加时间
        departmentMapper.insert(department);
        return ResultUtil.successce(department);
    }

    /**
     * 查看部门
     *
     * @param
     * @return
     */
    @Override
    public Results findAllDepartment() {
        List<Department> departmentList = departmentMapper.selectByExample(null);
        return ResultUtil.successce(departmentList);
    }

    /*  */

    /**
     * 编辑部门
     *
     * @param department
     *//*
    @Override
    public Result updateDepartment(Department department) {
        Integer departmentId = department.getDepartmentId();
        try {
            //通过id获取实体
            Department selectByPrimaryKey = departmentMapper.selectByPrimaryKey(departmentId);
            //重新编辑
            selectByPrimaryKey.setDepartmentName(department.getDepartmentName());
            selectByPrimaryKey.setDepartmentPrincipal(department.getDepartmentPrincipal());
            selectByPrimaryKey.setDepartmentBind(department.getDepartmentBind());
            selectByPrimaryKey.setDepartmentModifyTime(new Date().getTime());
            departmentMapper.updateByPrimaryKey(selectByPrimaryKey);
            return new Result(ResultCode.SUCCESS, "编辑成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(ResultCode.FAIL, "编辑失败");
        }
    }
*/
    public Results updateDepartment(Department department) {
        if (department == null) {   //若实体为空则异常为失败
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
        Integer departmentId = department.getDepartmentId();

        try {
            //通过id获取实体
            Department selectByPrimaryKey = departmentMapper.selectByPrimaryKey(departmentId);
            if (selectByPrimaryKey == null) {
                throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
            }
            //重新编辑
            selectByPrimaryKey.setDepartmentName(department.getDepartmentName());
            selectByPrimaryKey.setDepartmentPrincipal(department.getDepartmentPrincipal());
            selectByPrimaryKey.setDepartmentBind(department.getDepartmentBind());
            selectByPrimaryKey.setDepartmentModifyTime(new Date().getTime());
            //存入修改实体并返回
            departmentMapper.updateByPrimaryKey(selectByPrimaryKey);
            return ResultUtil.successce(selectByPrimaryKey);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }
    }

    /* *//**
     * 删除部门
     *
     * @param department_id
     *//*
    @Override
    public Result delDepartment(Integer[] department_id) {

        for (int i = 0; i < department_id.length; i++) {
            Department department = departmentMapper.selectByPrimaryKey(department_id[i]);
            if (department == null) {
                return new Result(ResultCode.FAIL, "查询不到该数据");
            }
            departmentMapper.deleteByPrimaryKey(department_id[i]);
        }
        return new Result(ResultCode.SUCCESS, "删除成功");
    }*/

    /**
     * 删除部门
     *
     * @param department_id
     */
    @Override
    public Results delDepartment(Integer[] department_id) {
        //遍历循环id并查出实体
        for (int i = 0; i < department_id.length; i++) {
            Department department = departmentMapper.selectByPrimaryKey(department_id[i]);
            if (department == null) {   //如果不存在给异常
                throw new MyException(ResultEnum.ERROR_POINTERNUll.getCode(), ResultEnum.ERROR_POINTERNUll.getMsg());
            }
            departmentMapper.deleteByPrimaryKey(department_id[i]);
        }
        return ResultUtil.success();
    }

    /**
     * 分页查询
     *
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageResult findPage(int page, int size) {
        //分页插件设置当前页和长度后，获取所有数据并返回
        PageHelper.startPage(page, size);
        Page<Department> departmentList = (Page<Department>) departmentMapper.selectByExample(null);
        return new PageResult(departmentList.getTotal(), departmentList.getResult());
    }

    /**
     * 根据部门ID查询
     *
     * @param department_id
     * @return
     */
    @Override
    public Results getDepartmentAll(Integer department_id) {
        Department department = departmentMapper.selectByPrimaryKey(department_id);
        //根据id查询实体，若空则异常，反之返回查询实体
        if (department == null) {
            throw new MyException(ResultEnum.ERROR_QUERYFILD.getCode(), ResultEnum.ERROR_QUERYFILD.getMsg());
        }

        return ResultUtil.successce(department);
    }
}
