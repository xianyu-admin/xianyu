package edu.nf.xianyu.order;

import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.entity.Order;
import org.aspectj.weaver.ast.Or;

import java.util.List;


/**
 * @author LWP
 * @date 2020/4/1
 */
public interface OrderService {

    PageInfo<Order> getOrder(Integer pageNum,Integer pageSize);
    List<Order> getOrderById(Integer userId);
    void deleteOrder(Integer userId);
    void saveOrder(Order order);
    void updateOrder(Order order);
}