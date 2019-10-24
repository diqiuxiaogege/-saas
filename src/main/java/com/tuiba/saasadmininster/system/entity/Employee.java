package com.tuiba.saasadmininster.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.tuiba.saasadmininster.common.annotation.IsMobile;
import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 员工信息
 */
@Data
@TableName("employee")
@Excel("员工信息表")
public class Employee implements Serializable {

    private static final long serialVersionUID = -1617063738326273978L;

    // 用户状态：有效
    public static final String STATUS_VALID = "1";
    // 用户状态：锁定
    public static final String STATUS_LOCK = "0";
    // 默认头像
    public static final String DEFAULT_AVATAR = "default.jpg";
    // 默认密码
    public static final String DEFAULT_PASSWORD = "123456";
    // 性别男
    public static final String SEX_MALE = "0";
    // 性别女
    public static final String SEX_FEMALE = "1";
    // 性别保密
    public static final String SEX_UNKNOW = "2";
    // 黑色主题
    public static final String THEME_BLACK = "black";
    // 白色主题
    public static final String THEME_WHITE = "white";
    // TAB开启
    public static final String TAB_OPEN = "1";
    // TAB关闭
    public static final String TAB_CLOSE = "0";

    //  员工id
    @TableId(value = "employee_id", type = IdType.AUTO)
    private Long employeeId;

    //  部门id
    @TableField("department_id")
    private Long departmentId;

    //  用户id
    @TableField("user_id")
    private Long userId;

    //  员工姓名
    @TableField("employee_name")
    @NotNull(message = "员工姓名不能为空")
    @ExcelField(value = "员工姓名")
    private String employeeName;

    //  员工头像
    @TableField("employee_img_url")
    private String employeeImgUrl;

    //  员工性别
    @TableField("employee_sex")
    @ExcelField(value = "员工性别")
    private String employeeSex;

    //  员工年龄
    @TableField("employee_age")
    @ExcelField(value = "员工年龄")
    private String employeeAge;

    //  员工手机号
    @TableField("employee_phone")
    @IsMobile(message = "{employeePhone}")
    @NotNull(message = "员工手机号不能为空")
    @ExcelField(value = "员工手机号")
    private String employeePhone;

    //  员工紧急电话
    @TableField("employee_emergency_phone")
    @IsMobile(message = "{employeeEmergencyPhone}")
    @ExcelField(value = "紧急联系电话")
    private String employeeEmergencyPhone;

    //  员工紧急联系人
    @TableField("employee_emergency_name")
    @ExcelField(value = "紧急联系人")
    private String employeeEmergencyName;

    //  员工学历
    @TableField("employee_education")
    @ExcelField("学历")
    private String employeeEducation;

    //  员工毕业院校
    @TableField("employee_graduation_school")
    @ExcelField("毕业院校")
    private String employeeGraduationSchool;

    //  员工婚姻状态
    @TableField("employee_marital_status")
    @ExcelField(value = "婚姻状况")
    private String employeeMaritalStatus;

    //  员工职位
    @TableField("employee_position")
    @ExcelField(value = "职位")
    private String employeePosition;

    //  员工地址
    @TableField("employee_address")
    @ExcelField(value = "地址")
    private String employeeAddress;

    //  员工现居地
    @TableField("employee_current_residence")
    @ExcelField(value = "现居地")
    private String employeeCurrentResidence;

    //  员工入职日期
    @TableField("employee_entry_date")
    @ExcelField(value = "入职时间")
    private Long employeeEntryDate;

    //  员工信息录入时间
    @TableField("employee_add_time")
    private Long employeeAddTime;

    //  员工信息修改时间
    @TableField("employee_modify_time")
    private Long employeeModifyTime;

    //  员工账号密码（默认密码为123456）
    @TableField("employee_password")
    @Size(min = 6)
    private String employeePassword;

    //  员工账号昵称
    @TableField("employee_nickname")
    private String employeeNickname;

    //  员工状态（0正常 1离职 2 异常 ）
    @TableField("employee_status")
    @ExcelField(value = "员工状态", writeConverterExp = "0=正常,1=请假,2=禁用,3=离职")
    private Long employeeStatus;

    //  员工签名
    @TableField("employee_signature")
    private String employeeSignature;

    //  员工账号所含积分
    @TableField("employee_score")
    private Long employeeScore;

    //  员工账户所属角色
    @TableField("role_id")
    @NotNull(message = "角色不能为空")
    private Long roleId;

    //  员工最后消息推送id
    @TableField("message_push_id")
    private Long messagePushId;

    //  最后登录时间
    @TableField("last_login_time")
    private Long lastLoginTime;

    //  预留字段
    @TableField("bak1")
    private String bak1;

    //  角色名称
    @TableField(exist = false)
    private String roleName;

}
