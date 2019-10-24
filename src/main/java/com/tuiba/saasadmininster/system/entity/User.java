package com.tuiba.saasadmininster.system.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.tuiba.saasadmininster.common.annotation.IsMobile;
import com.wuwenze.poi.annotation.Excel;
import com.wuwenze.poi.annotation.ExcelField;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户
 */
@Data
@TableName("user")
@Excel("用户信息表")
public class User implements Serializable {

    private static final long serialVersionUID = 3630255010176707574L;
    // 默认密码
    public static final String DEFAULT_PASSWORD = "123456";
    // 默认头像
    public static final String DEFAULT_AVATAR = "default.jpg";
    // 用户状态：有效
    public static final long STATUS_LOCK = 1;
    // 用户状态：锁定
    public static final long STATUS_VALID = 0;
    // 黑色主题
    public static final String THEME_BLACK = "black";
    // 白色主题
    public static final String THEME_WHITE = "white";
    // TAB开启
    public static final String TAB_OPEN = "1";
    // TAB关闭
    public static final String TAB_CLOSE = "0";

    //用户id
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    //真实姓名
    @TableField("real_name")
    @ExcelField("真实姓名")
    private String realName;

    //性别
    @TableField("sex")
    @ExcelField("性别")
    private Long sex;

    //用户名
    @TableField("username")
    @ExcelField("账户")
    private String username;

    //QQ号
    @TableField("user_qq")
    @ExcelField("QQ号")
    private Long userQq;

    //手机号
    @TableField("mobile")
    @ExcelField("手机号")
    @IsMobile(message = "{mobile}")
    private String mobile;

    //邮箱
    @TableField("mail")
    @ExcelField("邮箱")
    private String mail;

    //密码
    @TableField("password")
    @ExcelField("密码")
    private String password;

    //昵称
    @TableField("nickname")
    @ExcelField("昵称")
    private String nickname;

    //头像
    @TableField("avatar")
    private String avatar;

    //状态
    @TableField("status")
    @ExcelField("状态")
    private Long status;

    //签名
    @TableField("signature")
    @ExcelField("签名")
    private String signature;

    //积分
    @TableField("score")
    @ExcelField("积分")
    private String score;

    //最后登录时间
    @TableField("last_login_time")
    private Long lastLoginTime;

    //消息推送id
    @TableField("message_push_id")
    private Long messagePushId;

    //创建时间
    @TableField("create_time")
    private Long createTime;

    //修改时间
    @TableField("modify_time")
    private Long modifyTime;

    //标签
    @TableField("is_tab")
    private String isTab;

    //主题
    @TableField("theme")
    private String theme;

    //注册地址
    @TableField("register_address")
    private String registerAddress;

    //预留字段
    @TableField("bak1")
    private String bak1;

    //角色id
    @TableField(exist = false)
    private String roleId;

    //角色名称
    @TableField(exist = false)
    private String roleName;

    //部门名称
    @TableField(exist = false)
    private String departmentName;

    @TableField(exist = false)
    private String createTimeFrom;

    @TableField(exist = false)
    private String createTimeTo;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getUserQq() {
        return userQq;
    }

    public void setUserQq(Long userQq) {
        this.userQq = userQq;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Long getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Long getMessagePushId() {
        return messagePushId;
    }

    public void setMessagePushId(Long messagePushId) {
        this.messagePushId = messagePushId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getIsTab() {
        return isTab;
    }

    public void setIsTab(String isTab) {
        this.isTab = isTab;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getCreateTimeFrom() {
        return createTimeFrom;
    }

    public void setCreateTimeFrom(String createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
    }

    public String getCreateTimeTo() {
        return createTimeTo;
    }

    public void setCreateTimeTo(String createTimeTo) {
        this.createTimeTo = createTimeTo;
    }
}
