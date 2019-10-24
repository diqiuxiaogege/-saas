package com.tuiba.saasadmininster;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tuiba.saasadmininster.*.mapper")
@MapperScan("com.tuiba.saasadmininster.*.dao")
public class SaasadmininsterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaasadmininsterApplication.class, args);
    }

}
