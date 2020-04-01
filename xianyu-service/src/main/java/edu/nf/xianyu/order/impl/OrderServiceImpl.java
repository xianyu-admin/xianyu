package edu.nf.xianyu.order.impl;

import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.entity.Order;
import edu.nf.xianyu.order.OrderService;
import edu.nf.xianyu.order.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author LWP
 * @date 2020/4/1
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao dao;

    @Override
    public PageInfo<Order> getOrder(Integer pageNum, Integer pageSize) {
        try{
            PageInfo<Order> pageInfo = new PageInfo<>(dao.getOrder(pageNum,pageSize));
            return pageInfo;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteOrder(Integer userId) {
        try{
            dao.deleteOrder(userId);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}