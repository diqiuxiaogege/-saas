package com.tuiba.saasadmininster.system.controller;

import com.tuiba.saasadmininster.common.annotation.Limit;
import com.tuiba.saasadmininster.common.controller.BaseController;
import com.tuiba.saasadmininster.common.entity.FebsResponse;
import com.tuiba.saasadmininster.common.exception.FebsException;
import com.tuiba.saasadmininster.common.utils.CaptchaUtil;
import com.tuiba.saasadmininster.monitor.service.ILoginLogService;
import com.tuiba.saasadmininster.system.entity.User;
import com.tuiba.saasadmininster.system.service.IUserService;
import com.tuiba.saasadmininster.common.utils.MD5Util;
import com.wf.captcha.base.Captcha;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotBlank;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author MrBird
 */
@Validated
@RestController
public class LoginController extends BaseController {

    @Autowired
    private IUserService userService;
    @Autowired
    private ILoginLogService loginLogService;

    /**
     * 登录接口
     * @param username 用户名
     * @param password 密码
     * @param rememberMe
     * @return
     * @throws FebsException
     */
    @PostMapping("login")
    @Limit(key = "login", period = 60, count = 20, name = "登录接口", prefix = "limit")
    public FebsResponse login(
            @NotBlank(message = "{required}") String username,
            @NotBlank(message = "{required}") String password,
            boolean rememberMe) throws FebsException {
//      密码加密
        password = MD5Util.encrypt(username.toLowerCase(), password);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        super.login(token);
//        // 保存登录日志
//        LoginLog loginLog = new LoginLog();
//        loginLog.setUsername(username);
//        loginLog.setSystemBrowserInfo();
//        this.loginLogService.saveLoginLog(loginLog);

        return new FebsResponse().success();
    }

    @GetMapping("index/{username}")
    public FebsResponse index(@NotBlank(message = "{required}") @PathVariable String username) {
        // 更新登录时间
        this.userService.updateLoginTime(username);
        Map<String, Object> data = new HashMap<>();
        // 获取系统访问记录
        Long totalVisitCount = this.loginLogService.findTotalVisitCount();
        data.put("totalVisitCount", totalVisitCount);
        Long todayVisitCount = this.loginLogService.findTodayVisitCount();
        data.put("todayVisitCount", todayVisitCount);
        Long todayIp = this.loginLogService.findTodayIp();
        data.put("todayIp", todayIp);
        // 获取近期系统访问记录
        List<Map<String, Object>> lastSevenVisitCount = this.loginLogService.findLastSevenDaysVisitCount(null);
        data.put("lastSevenVisitCount", lastSevenVisitCount);
        User param = new User();
        param.setUsername(username);
        List<Map<String, Object>> lastSevenUserVisitCount = this.loginLogService.findLastSevenDaysVisitCount(param);
        data.put("lastSevenUserVisitCount", lastSevenUserVisitCount);
        return new FebsResponse().success().data(data);
    }

    @GetMapping("images/captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
        CaptchaUtil.outPng(110, 34, 4, Captcha.TYPE_ONLY_NUMBER, request, response);
    }
}
