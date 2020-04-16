package edu.nf.xianyu.controller;

import edu.nf.xianyu.controller.vo.ResponseVo;
import edu.nf.xianyu.discuss.CommodityDiscussService;
import edu.nf.xianyu.entity.CommodityDiscuss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2020/4/7
 */
@RestController
public class CommodityDiscussController extends BaseController{

    @Autowired
    CommodityDiscussService service;

    @GetMapping("discuss/get_discuss")
    public ResponseVo getCommodityDiscuss(Integer pageNum, Integer pageSize){
        return success(service.getCommodityDiscuss(pageNum, pageSize));
    }

    @GetMapping("discuss/delete_discuss")
    public ResponseVo deleteCommodityDiscussById(Integer id){
        service.deleteCommodityDiscussById(id);
        return success("删除成功");
    }

    @RequestMapping("discuss/save_discuss")
    public ResponseVo saveCommodityDiscuss(CommodityDiscuss commodityDiscuss){
        service.saveCommodityDiscuss(commodityDiscuss);
        return success("添加成功");
    }
}
