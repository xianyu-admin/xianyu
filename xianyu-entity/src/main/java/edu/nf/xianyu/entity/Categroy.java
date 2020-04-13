package edu.nf.xianyu.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author LWP
 * @date 2020/3/7
 * 品类实体
 */
@Data
public class Categroy {

    private int categroyId;
    private int categoryCode;
    private String categoryName;
    private String categoryLevel;
    private String categorySeq;
    private String endFlag;
    private Timestamp createTime;
    private Timestamp updateTime;
}