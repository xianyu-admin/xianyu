package edu.nf.xianyu.entity;

import lombok.Data;

/**
 * @author LWP
 * @date 2020/3/7
 * 商品用户关联
 */
@Data
public class UserCommid {
    private int commodityId;
    private int userId;
}