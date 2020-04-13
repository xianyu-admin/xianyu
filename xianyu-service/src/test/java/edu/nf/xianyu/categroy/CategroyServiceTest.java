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

    }

    @Test
    public void listCategroy() {

    }
}