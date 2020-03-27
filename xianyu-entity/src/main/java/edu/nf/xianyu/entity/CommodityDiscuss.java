package edu.nf.xianyu.entity;

import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author LWP
 * @date 2020/3/7
 * 商品评论实体
 */
@Data
public class CommodityDiscuss {

    private int commodityId;
    private int discussId;
    private int userId;
    private String discussContent;
    private Timestamp createTime;
    private Timestamp updateTime;
}