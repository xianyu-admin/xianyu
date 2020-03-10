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
    private int categroyCode;
    private String categroyName;
    private String categroyLeve;
    private String categroySeq;
    private String endFlag;
    private Timestamp createTime;
    private Timestamp updateTime;
}