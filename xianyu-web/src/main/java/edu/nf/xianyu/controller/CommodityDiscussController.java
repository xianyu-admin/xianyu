package edu.nf.xianyu.controller;

import edu.nf.xianyu.controller.vo.ResponseVo;
import edu.nf.xianyu.discuss.CommodityDiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
        service.deleteCommodityDisxussById(id);
        return success("删除成功");
    }
}
