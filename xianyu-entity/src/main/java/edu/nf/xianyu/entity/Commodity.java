package edu.nf.xianyu.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author LWP
 * @date 2020/3/7
 * 商品详细实体
 */
@Data
public class Commodity {
    private int commodityId;
    private int categroyId;
    private String commodityName;
    private double commodityPrice;
    private String commodityLable;
    private String commoditySpec;
    private String commodityDesc;
    private String commoditySep;
    private String commodityOrgin;
    private String commodityPci;
    private int commodityStatus;
    private Timestamp createTime;
    private Timestamp updateTime;
}