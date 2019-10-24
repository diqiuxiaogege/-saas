package com.tuiba.saasadmininster.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tuiba.saasadmininster.system.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Employee
 * @author Lu
 */
public interface EmployeeMapper extends BaseMapper<Employee> {

    /**
     * 通过员工手机号查找员工
     *
     * @param employeePhone 手机号
     * @return 员工
     */
    Employee findByEmployeeName(String employeePhone);

    /**
     * 查找员工详细信息
     *
     * @param page 分页对象
     * @param employee 员工对象，用于传递查询条件
     * @return Ipage
     */
    IPage<Employee> findEmployeeDetailPage(Page page, @Param("employee") Employee employee);

    /**
     * 查找用户详细信息
     *
     * @param employee 用户对象，用于传递查询条件
     * @return List<Empolyee>
     */
    List<Employee> findEmployeeDetail(@Param("employee") Employee employee);



}
