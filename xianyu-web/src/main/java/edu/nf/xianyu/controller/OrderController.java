package edu.nf.xianyu.controller;

import edu.nf.xianyu.controller.vo.ResponseVo;
import edu.nf.xianyu.entity.Order;
import edu.nf.xianyu.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LWP
 * @date 2020/4/1
 */
@RestController
public class OrderController extends BaseController {

    @Autowired
    private OrderService service;

    @GetMapping("order/get_order")
    public ResponseVo getOrder(Integer pageNum,Integer pageSize){
        return success(service.getOrder(pageNum,pageSize));
    }

    @GetMapping("order/delete_order")
    public ResponseVo deleteOrder(Integer userId){
        service.deleteOrder(userId);
        return success("删除成功");
    }

    @GetMapping("order/getOrderBuId")
    public ResponseVo getOrderBuId(Integer userId){
        return success(service.getOrderById(userId));
    }

    @GetMapping("order/save_order")
    public ResponseVo saveOrder(Order order){
        service.saveOrder(order);
        return success("添加成功");
    }

    @GetMapping("order/update_order")
    public ResponseVo updateOrder(Order order){
        service.updateOrder(order);
        return success("修改成功");
    }
}