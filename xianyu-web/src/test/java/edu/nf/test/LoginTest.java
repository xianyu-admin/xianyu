package edu.nf.test;

import edu.nf.xianyu.login.service.LoginService;
import edu.nf.xianyu.user.Entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author LWP
 * @date 2020/3/7
 */
@SpringBootTest
@SpringBootApplication(scanBasePackages = "edu.nf.xianyu")
public class LoginTest {
    @Autowired
    private LoginService service;

    @Test
    void TestLogin(){
        User user = service.userLogin("meet","123");
        System.out.println(user.getUserBindMoblie());
    }
}