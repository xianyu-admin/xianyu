package edu.nf.xianyu.order;

import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.entity.Order;


/**
 * @author LWP
 * @date 2020/4/1
 */
public interface OrderService {

    PageInfo<Order> getOrder(Integer pageNum,Integer pageSize);
    void deleteOrder(Integer userId);
}