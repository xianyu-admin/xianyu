package edu.nf.xianyu.entity;

import lombok.Data;

/**
 * @author LWP
 * @date 2020/3/7
 * 订单信息
 */
@Data
public class Order {

    private int orderId;
    private int userId;
    private int commodityId;
    private int orderAnount;
    private String orderPrice;
    private String orderTotal;
}