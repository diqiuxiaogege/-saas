package com.tuiba.saasadmininster.monitor.controller;

import com.tuiba.saasadmininster.common.entity.FebsConstant;
import com.tuiba.saasadmininster.monitor.helper.FebsActuatorHelper;
import com.tuiba.saasadmininster.monitor.service.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MrBird
 */
@Controller("monitorView")
@RequestMapping(FebsConstant.VIEW_PREFIX + "monitor")
public class ViewController {

    @Autowired
    private FebsActuatorHelper actuatorHelper;
    @Autowired
    private IRedisService redisService;

//    @GetMapping("online")
//    @RequiresPermissions("online:view")
//    public String online() {
//        return FebsUtil.view("monitor/online");
//    }

//    @GetMapping("log")
//    @RequiresPermissions("log:view")
//    public String log() {
//        return FebsUtil.view("monitor/log");
//    }
//
//    @GetMapping("loginlog")
//    @RequiresPermissions("loginlog:view")
//    public String loginLog() {
//        return FebsUtil.view("monitor/loginLog");
//    }
//
//    @GetMapping("redis/info")
//    @RequiresPermissions("redis:view")
//    public String getRedisInfo(Model model) throws RedisConnectException {
//        List<RedisInfo> infoList = this.redisService.getRedisInfo();
//        model.addAttribute("infoList", infoList);
//        return FebsUtil.view("monitor/redisInfo");
//    }
//
//    @GetMapping("redis/terminal")
//    @RequiresPermissions("redis:terminal:view")
//    public String redisTerminal(Model model) {
//        String osName = System.getProperty("os.name");
//        model.addAttribute("osName", osName);
//        return FebsUtil.view("monitor/redisTerminal");
//    }
//
//    @GetMapping("httptrace")
//    @RequiresPermissions("httptrace:view")
//    public String httptrace() {
//        return FebsUtil.view("monitor/httpTrace");
//    }

//    @GetMapping("jvm")
//    @RequiresPermissions("jvm:view")
//    public String jvmInfo(Model model) {
//        List<FebsMetricResponse> jvm = actuatorHelper.getMetricResponseByType("jvm");
//        JvmInfo jvmInfo = actuatorHelper.getJvmInfoFromMetricData(jvm);
//        model.addAttribute("jvm", jvmInfo);
//        return FebsUtil.view("monitor/jvmInfo");
//    }

//    @GetMapping("tomcat")
//    @RequiresPermissions("tomcat:view")
//    public String tomcatInfo(Model model) {
//        List<FebsMetricResponse> tomcat = actuatorHelper.getMetricResponseByType("tomcat");
//        TomcatInfo tomcatInfo = actuatorHelper.getTomcatInfoFromMetricData(tomcat);
//        model.addAttribute("tomcat", tomcatInfo);
//        return FebsUtil.view("monitor/tomcatInfo");
//    }

//    @GetMapping("server")
//    @RequiresPermissions("server:view")
//    public String serverInfo(Model model) {
//        List<FebsMetricResponse> jdbcInfo = actuatorHelper.getMetricResponseByType("jdbc");
//        List<FebsMetricResponse> systemInfo = actuatorHelper.getMetricResponseByType("system");
//        List<FebsMetricResponse> processInfo = actuatorHelper.getMetricResponseByType("process");
//
//        ServerInfo serverInfo = actuatorHelper.getServerInfoFromMetricData(jdbcInfo, systemInfo, processInfo);
//        model.addAttribute("server", serverInfo);
//        return FebsUtil.view("monitor/serverInfo");
//    }

//    @GetMapping("swagger")
//    public String swagger() {
//        return FebsUtil.view("monitor/swagger");
//    }
}
