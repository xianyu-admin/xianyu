package edu.nf.test;

import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.categroy.CategroyService;
import edu.nf.xianyu.entity.Categroy;
import edu.nf.xianyu.entity.Commodity;
import edu.nf.xianyu.entity.Order;
import edu.nf.xianyu.login.LoginService;
import edu.nf.xianyu.entity.User;
import edu.nf.xianyu.order.OrderService;
import edu.nf.xianyu.shopping.CommodityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author LWP
 * @date 2020/3/7
 */
//@SpringBootTest
//@SpringBootApplication(scanBasePackages = "edu.nf.xianyu")
public class UserTest {
    @Autowired
    private LoginService service;
    @Test
    void TestLogin(){
        User user = service.userLogin("17817537527","123");
        System.out.println(user.getUserBindMoblie());
    }
    @Test
    void listUser(){
//        int i =service.listUser(1,2).getList().size();
//        System.out.println(i);
        User user = new User();
        user.setPassword("1234");
        user.setUserId(1);
        service.updateUser(user);
    }
    @Test
    void saveUserTest(){
        User user = new User();
        user.setUserNick("me");
        user.setUserName("张三");
        user.setUserBindMoblie("11231232");
        user.setPassword("123");
        user.setUrlHeadUrl("无头像");
        user.setUserCity("广州");
        Date date = new Date(System.currentTimeMillis());
        user.setUserCreateTime(date);
        service.saveUser(user);
    }

}