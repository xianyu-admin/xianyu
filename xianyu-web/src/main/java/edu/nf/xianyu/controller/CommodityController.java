package edu.nf.xianyu.controller;

import edu.nf.xianyu.commodity.CommodityService;
import edu.nf.xianyu.controller.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LWP
 * @date 2020/3/23
 */
@RestController
public class CommodityController extends BaseController {

    @Autowired
    private CommodityService service;

    @GetMapping("get_commodity")
    public ResponseVo getCommodity(Integer pageNum,Integer pageSize){
        return success(service.getCommodity(pageNum,pageSize));
    }
}