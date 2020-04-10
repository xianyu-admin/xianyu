package edu.nf.test;

import edu.nf.xianyu.entity.Commodity;
import edu.nf.xianyu.shopping.CommodityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;

/**
 * @author LWP
 * @date 2020/4/10
 */
@SpringBootTest
@SpringBootApplication(scanBasePackages = "edu.nf.xianyu")
public class CommodityTest {
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

    @Test
    void deleteCommodity(){
        commodityService.deleteCommodity(19);
    }
    @Test
    void updateCommodity(){
        Commodity commodity = new Commodity();
        commodity.setCommodityId(18);
        commodity.setCategroyId(18);
        commodity.setCommodityPrice(2888);
        commodityService.updateCommodity(commodity);
    }
}
