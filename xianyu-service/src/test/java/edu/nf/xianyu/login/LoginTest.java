package edu.nf.xianyu.login;

import edu.nf.xianyu.entity.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author LWP
 * @date 2020/3/6
 */
@SpringBootTest
@SpringBootApplication(scanBasePackages = "edu.nf.xianyu")
@MapperScan(basePackages = "edu.nf.xianyu.login.dao")
public class LoginTest {

    @Autowired
    private LoginService service;

    @Test
    void TestLogin(){
        User user = service.userLogin("17817537527","123");
        System.out.println(user.getUserBindMoblie());
    }
}