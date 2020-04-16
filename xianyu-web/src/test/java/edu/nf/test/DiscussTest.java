package edu.nf.test;

import edu.nf.xianyu.discuss.CommodityDiscussService;
import edu.nf.xianyu.entity.CommodityDiscuss;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;

/**
 * @author LWP
 * @date 2020/4/16
 */
//@SpringBootTest
//@SpringBootApplication(scanBasePackages = "edu.nf.xianyu")
public class DiscussTest {

    @Autowired
    private CommodityDiscussService commodityDiscussService;

    @Test
    public void saveCommodityDiscussTest(){
        CommodityDiscuss commodityDiscuss = new CommodityDiscuss();
        commodityDiscuss.setCommodityId(2);
        commodityDiscuss.setUserId(2);
        commodityDiscuss.setDiscussContent("好看");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        commodityDiscuss.setCreateTime(timestamp);
        commodityDiscuss.setUpdateTime(timestamp);
        commodityDiscussService.saveCommodityDiscuss(commodityDiscuss);
    }

}