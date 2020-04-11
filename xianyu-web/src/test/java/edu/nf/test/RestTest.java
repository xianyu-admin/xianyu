package edu.nf.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

/**
 * @author LWP
 * @date 2020/4/11
 */
@SpringBootTest
@SpringBootApplication(scanBasePackages = "edu.nf.xianyu")
public class RestTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    void RestConfig(){
        String url = "http://localhost:9200/commodity/_search";
        String result = restTemplate.getForObject(url,String.class);
        System.out.println(result);
    }
}