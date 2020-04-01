package edu.nf.xianyu.order.dao;

import edu.nf.xianyu.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LWP
 * @date 2020/4/1
 */
public interface OrderDao {

    List<Order> getOrder(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
    void deleteOrder(Integer userId);
}