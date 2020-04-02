package edu.nf.test;

import edu.nf.xianyu.entity.Commodity;
import edu.nf.xianyu.login.LoginService;
import edu.nf.xianyu.entity.User;
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
@SpringBootTest
@SpringBootApplication(scanBasePackages = "edu.nf.xianyu")
public class XianYuTest {
    @Autowired
    private LoginService service;

    @Test
    void TestLogin(){
        User user = service.userLogin("17817537527","123");
        System.out.println(user.getUserBindMoblie());
    }

    @Test
    void listUser(){
        int i =service.listUser(1,2).getList().size();
        System.out.println(i);
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

    @Autowired
    private CommodityService commodityService;

    @Test
    void getCommodity(){
        int i =commodityService.getCommodity(1,10).getList().size();
        System.out.println(i);
    }

    @Test
    void saveCommodity(){
        Commodity commodity = new Commodity();
        commodity.setCategroyId(17);
        commodity.setCommodityName("格力空调");
        commodity.setCommodityPrice(3000);
        commodity.setCommodityLable("电子");
        commodity.setCommoditySpec("规格");
        commodity.setCommodityDesc("电子产品");
        commodity.setCommoditySep("1108");
        commodity.setCommodityOrgin("广东");
        commodity.setCommodityPci("暂无图片");
        commodity.setCommodityStatus(1);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        commodity.setCreateTime(timestamp);
        commodity.setUpdateTime(timestamp);
        commodityService.saveCommodity(commodity);
    }


}