package edu.nf.xianyu.categroy;

import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.entity.Categroy;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@SpringBootApplication(scanBasePackages = "edu.nf.xianyu")
@MapperScan(basePackages = "edu.nf.xianyu.categroy.dao")
public class CategroyServiceTest {

    @Autowired
    private CategroyService service;

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
        service.saveCategroy(categroy);
        System.out.println(categroy.getCategroyName());
    }

    @Test
    public void listCategroy() {
        PageInfo<Categroy> categroy = service.listCategroy(1,5);
        for (Categroy categroy1 : categroy.getList()) {
            System.out.println(categroy1.getCategroyName());
        }
    }
}