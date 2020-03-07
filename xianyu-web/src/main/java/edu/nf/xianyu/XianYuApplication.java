package edu.nf.xianyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author LWP
 * @date 2020/3/2
 */
@SpringBootApplication
@MapperScan(basePackages = "edu.nf.xianyu.login.dao")
public class XianYuApplication {
    public static void main(String[] args) {
       SpringApplication.run(XianYuApplication.class,args);
    }
}