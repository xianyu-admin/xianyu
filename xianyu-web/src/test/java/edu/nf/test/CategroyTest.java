package edu.nf.test;

import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.categroy.CategroyService;
import edu.nf.xianyu.entity.Categroy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;

/**
 * @author LWP
 * @date 2020/4/10
 */
//@SpringBootTest
//@SpringBootApplication(scanBasePackages = "edu.nf.xianyu")
public class CategroyTest {

    @Autowired
    private CategroyService categroyService;

    @Test
    public void saveCategroy() {
        Categroy categroy = new Categroy();
        categroy.setCategroyCode(001);
        categroy.setCategroyName("鸡肉类");
        categroy.setCategroyLeve("大类");
        categroy.setCategroySeq("1");
        categroy.setEndFlag("是");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        categroy.setCreateTime(timestamp);
        categroy.setUpdateTime(timestamp);
        categroyService.saveCategroy(categroy);
        System.out.println(categroy.getCategroyName());
    }

    @Test
    public void listCategroy() {
        PageInfo<Categroy> categroy = categroyService.listCategroy(1,5);
        for (Categroy categroy1 : categroy.getList()) {
            System.out.println(categroy1.getCategroyCode());
        }
    }
}