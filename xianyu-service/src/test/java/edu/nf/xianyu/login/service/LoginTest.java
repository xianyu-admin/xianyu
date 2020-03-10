package edu.nf.xianyu.login.service;

import edu.nf.xianyu.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author LWP
 * @date 2020/3/6
 */
@SpringBootTest
@SpringBootApplication(scanBasePackages = "edu.nf.xianyu")
public class LoginTest {

    @Autowired
    private LoginService service;

    @Test
    void TestLogin(){
        User user = service.userLogin("meet","123");
        System.out.println(user.getUserName()); 
    }
}