package edu.nf.xianyu.Es;

import edu.nf.xianyu.config.EsConfig;
import edu.nf.xianyu.entity.Commodity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

/**
 * @author LWP
 * @date 2020/4/11
 */

public class EsTest {

    @Autowired
    private ElasticsearchRestTemplate template;

    @Autowired
    private EsConfig config;

    @Test
    void EsTest(){
        template.createIndex(Commodity.class);
    }
}