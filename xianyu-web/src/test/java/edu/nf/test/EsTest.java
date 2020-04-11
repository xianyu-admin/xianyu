package edu.nf.test;

import edu.nf.xianyu.config.EsConfig;
import edu.nf.xianyu.entity.Commodity;
import edu.nf.xianyu.shopping.CommodityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

/**
 * @author LWP
 * @date 2020/4/11
 */
//@SpringBootTest
//@SpringBootApplication(scanBasePackages = "edu.nf.xianyu")
public class EsTest {

    @Autowired
    private ElasticsearchRestTemplate template;

    @Autowired
    private EsConfig config;

    @Autowired
    private CommodityService commodityService;

    @Test
    void EsTest(){
        //template.createIndex(Commodity.class);
        template.putMapping(Commodity.class);
    }
    @Test
    void addCommodity(){
        for (Commodity commodity : commodityService.getCommodity(2, 10).getList()) {
            config.index(commodity);
        }
    }

    @Test
    void getCommodity(){
        Iterable<Commodity> it = config.findAll();
        for (Commodity commodity : it) {
            System.out.println(commodity.getCommodityName());
        }
    }
}