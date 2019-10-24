package com.tuiba.saasadmininster.Exception;




/**
 * 自定义异常类型
 * @author Administrator
 * @version 1.0
 * @create 2018-09-14 17:28
 **/
public class MyException extends RuntimeException {
    private int code;

    //自定义异常信息
    public MyException(  String message ) {
        super(message);
    }

    public MyException( int code, String message ) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
