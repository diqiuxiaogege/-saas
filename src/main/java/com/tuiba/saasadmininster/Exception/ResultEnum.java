package com.tuiba.saasadmininster.Exception;

/**
 * @author : yangzhi
 * @date : 17:55 2019/10/19
 */
public enum  ResultEnum {
    UNKNOWN_ERROR(500,"未知错误"),
    SUCCESS(200,"操作成功"),
    ERROR_POINTERNUll(101,"所获取数据不存在"),
    ERROR_QUERYFILD(102,"查询失败"),
    ResultEnum(103,"此操作需要登陆系统！"),
    UNAUTHORISE(104,"权限不足,无权操作!"),
    INVALID_PARAM(105,"非法参数！"),
    SERVER_ERROR(106,"抱歉，系统繁忙，请稍后重试！");

    private int code;
    private String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
