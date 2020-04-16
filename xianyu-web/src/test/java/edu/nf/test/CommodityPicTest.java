package edu.nf.test;

import edu.nf.xianyu.commodityPic.CommodityPicService;
import edu.nf.xianyu.entity.CommodityPic;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author LWP
 * @date 2020/4/16
 */
@SpringBootTest
@SpringBootApplication(scanBasePackages = "edu.nf.xianyu")
public class CommodityPicTest {

    @Autowired
    private CommodityPicService commodityPicService;

    @Test
    public void getCommodityPicTest(){
        for (CommodityPic commodityPic : commodityPicService.getCommodityPic()) {
            System.out.println(commodityPic.getPicType());
        }
    }
}