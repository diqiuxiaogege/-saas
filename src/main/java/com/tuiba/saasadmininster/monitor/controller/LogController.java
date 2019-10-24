package com.tuiba.saasadmininster.monitor.controller;

import com.tuiba.saasadmininster.common.controller.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MrBird
 */
@Slf4j
@RestController
@RequestMapping("log")
public class LogController extends BaseController {

//    @Autowired
//    private ILogService logService;
//
//    @GetMapping("list")
//    @RequiresPermissions("log:view")
//    public FebsResponse logList(SystemLog log, QueryRequest request) {
//        Map<String, Object> dataTable = getDataTable(this.logService.findLogs(log, request));
//        return new FebsResponse().success().data(dataTable);
//    }
//
//    @GetMapping("delete/{ids}")
//    @RequiresPermissions("log:delete")
//    @ControllerEndpoint(exceptionMessage = "删除日志失败")
//    public FebsResponse deleteLogss(@NotBlank(message = "{required}") @PathVariable String ids) {
//        String[] logIds = ids.split(StringPool.COMMA);
//        this.logService.deleteLogs(logIds);
//        return new FebsResponse().success();
//    }
//
//    @GetMapping("excel")
//    @RequiresPermissions("log:export")
//    @ControllerEndpoint(exceptionMessage = "导出Excel失败")
//    public void export(QueryRequest request, SystemLog lg, HttpServletResponse response) {
//        List<SystemLog> logs = this.logService.findLogs(lg, request).getRecords();
//        ExcelKit.$Export(SystemLog.class, response).downXlsx(logs, false);
//    }
}
