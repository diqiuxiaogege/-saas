package com.tuiba.saasadmininster.common.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author MrBird
 */
@Aspect
@Component
public class ControllerEndpointAspect extends AspectSupport {

//    @Autowired
//    private ILogService logService;
//
//    @Pointcut("@annotation(cc.mrbird.febs.common.annotation.ControllerEndpoint)")
//    public void pointcut() {
//    }
//
//    @Around("pointcut()")
//    public Object around(ProceedingJoinPoint point) throws FebsException {
//        Object result;
//        Method targetMethod = resolveMethod(point);
//        ControllerEndpoint annotation = targetMethod.getAnnotation(ControllerEndpoint.class);
//        String operation = annotation.operation();
//        long start = System.currentTimeMillis();
//        try {
//            result = point.proceed();
//            if (StringUtils.isNotBlank(operation)) {
//                HttpServletRequest request = HttpContextUtil.getHttpServletRequest();
//                logService.saveLog(point, targetMethod, request, operation, start);
//            }
//            return result;
//        } catch (Throwable throwable) {
//            String exceptionMessage = annotation.exceptionMessage();
//            String message = throwable.getMessage();
//            String error = FebsUtil.containChinese(message) ? exceptionMessage + "，" + message : exceptionMessage;
//            throw new FebsException(error);
//        }
//    }
}



