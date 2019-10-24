package com.tuiba.saasadmininster.Exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : yangzhi
 * @date : 17:55 2019/10/19
 */
@ControllerAdvice
public class MyExceptionHandle {
    private static final Logger logger = LoggerFactory.getLogger(MyExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Results handle(Exception e) {
        if(e instanceof MyException) {
            MyException myException = (MyException)e;
            return ResultUtil.error(myException.getCode(),myException.getMessage());
        }else{
            logger.error("系统异常",e);
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(), ResultEnum.UNKNOWN_ERROR.getMsg());
        }
    }
}
