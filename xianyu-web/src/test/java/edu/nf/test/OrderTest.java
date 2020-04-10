package edu.nf.test;

import edu.nf.xianyu.entity.Order;
import edu.nf.xianyu.order.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author LWP
 * @date 2020/4/10
 */
//@SpringBootTest
//@SpringBootApplication(scanBasePackages = "edu.nf.xianyu")
public class OrderTest {

    @Autowired
    private OrderService orderService;

    @Test
    void testOrder(){
        int i =orderService.getOrder(1,10).getList().size();
        System.out.println(i);
    }

    @Test
    void testSaveOrder(){
        Order order = new Order();
        order.setUserId(1);
        order.setCommodityId(7);
        order.setOrderAnount(2);
        order.setOrderPrice(200);
        order.setOrderTotal(order.getOrderPrice()*order.getOrderAnount());
        orderService.saveOrder(order);
    }

    @Test
    void testUpdateOrder(){
        Order order = new Order();
        order.setOrderId(7);
        order.setCommodityId(7);
        order.setOrderAnount(2);
        //order.setOrderPrice(200);
        orderService.updateOrder(order);
    }
}