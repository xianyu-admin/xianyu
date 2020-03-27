package edu.nf.xianyu.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author LWP
 * @date 2020/3/7
 * 商品图片表
 */
@Data
public class CommodityPic {

    private int picId;
    private int commodityId;
    private String picUrl;
    private int pirSeq;
    private String picType;
    private Timestamp createTime;
    private Timestamp updateTime;
}