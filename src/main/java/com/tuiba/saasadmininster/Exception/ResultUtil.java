package com.tuiba.saasadmininster.Exception;

/**
 * @author : yangzhi
 * @date : 18:01 2019/10/19
 */
public class ResultUtil {
    public static Results error(int code, String msg) {
        Results results = new Results();
        results.setCode(code);
        results.setMsg(msg);
        results.setData(null);
        return results;
    }

    public static Results successce(Object obj) {
        Results results = new Results();
        results.setCode(200);
        results.setMsg("成功");
        results.setData(obj);
        return results;
    }

    public static Results success() {
        Results results = new Results();
        results.setCode(200);
        results.setMsg("成功");
        results.setData("操作成功！");
        return results;
    }

}
