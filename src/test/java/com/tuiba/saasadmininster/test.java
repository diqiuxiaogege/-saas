package com.tuiba.saasadmininster;

import com.tuiba.saasadmininster.common.utils.MD5Util;

/**
 * @author : yangzhi
 * @date : 17:06 2019/10/23
 */
public class test {
    public static void main(String[] args) {
        String admin = MD5Util.encrypt("admin", "666666");
        System.out.println(admin);
    }
}
