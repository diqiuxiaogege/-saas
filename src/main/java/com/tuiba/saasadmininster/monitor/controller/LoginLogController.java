package com.tuiba.saasadmininster.monitor.controller;

import com.tuiba.saasadmininster.common.controller.BaseController;
import com.tuiba.saasadmininster.monitor.service.ILoginLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MrBird
 */
@Slf4j
@RestController
@RequestMapping("loginLog")
public class LoginLogController extends BaseController {

    @Autowired
    private ILoginLogService loginLogService;

//    @GetMapping("list")
//    @RequiresPermissions("loginlog:view")
//    public FebsResponse loginLogList(LoginLog loginLog, QueryRequest request) {
//        Map<String, Object> dataTable = getDataTable(this.loginLogService.findLoginLogs(loginLog, request));
//        return new FebsResponse().success().data(dataTable);
//    }
//
//    @GetMapping("delete/{ids}")
//    @RequiresPermissions("loginlog:delete")
//    @ControllerEndpoint(exceptionMessage = "删除日志失败")
//    public FebsResponse deleteLogss(@NotBlank(message = "{required}") @PathVariable String ids) {
//        String[] loginLogIds = ids.split(StringPool.COMMA);
//        this.loginLogService.deleteLoginLogs(loginLogIds);
//        return new FebsResponse().success();
//    }
//
//    @GetMapping("excel")
//    @RequiresPermissions("loginlog:export")
//    @ControllerEndpoint(exceptionMessage = "导出Excel失败")
//    public void export(QueryRequest request, LoginLog loginLog, HttpServletResponse response) {
//        List<LoginLog> loginLogs = this.loginLogService.findLoginLogs(loginLog, request).getRecords();
//        ExcelKit.$Export(LoginLog.class, response).downXlsx(loginLogs, false);
//    }
}
