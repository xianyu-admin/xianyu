package edu.nf.xianyu.order.impl;

import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.entity.Order;
import edu.nf.xianyu.order.OrderService;
import edu.nf.xianyu.order.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author LWP
 * @date 2020/4/1
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao dao;

    @Override
    @Cacheable(value = "cache2")
    public PageInfo<Order> getOrder(Integer pageNum, Integer pageSize) {
        try{
            PageInfo<Order> pageInfo = new PageInfo<>(dao.getOrder(pageNum,pageSize));
            return pageInfo;
        }catch(Exception e){
            throw new RuntimeException("服务器错误");
        }
    }

    @Override
    public void deleteOrder(Integer userId) {
        try{
            dao.deleteOrder(userId);
        }catch(Exception e){
            throw new RuntimeException("服务器错误");
        }
    }

    @Override
    public List<Order> getOrderById(Integer userId) {
        try{
            return dao.getOrderById(userId);
        }catch(Exception e){
            throw new RuntimeException("服务器错误");
        }
    }

    @Override
    public void saveOrder(Order order) {
        try{
            dao.saveOrder(order);
        }catch(Exception e){
            throw new RuntimeException("服务器错误");
        }
    }

    @Override
    public void updateOrder(Order order) {
        try{
            dao.updateOrder(order);
        }catch(Exception e){
            throw new RuntimeException("服务器错误");
        }
    }
}