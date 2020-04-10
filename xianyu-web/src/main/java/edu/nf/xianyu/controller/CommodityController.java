package edu.nf.xianyu.controller;

import edu.nf.xianyu.entity.Commodity;
import edu.nf.xianyu.shopping.CommodityService;
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

    @GetMapping("shopping/get_commodity")
    public ResponseVo getCommodity(Integer pageNum,Integer pageSize){
        return success(service.getCommodity(pageNum,pageSize));
    }

    @GetMapping("shopping/save_commodity")
    public ResponseVo saveCommodity(Commodity commodity){
        service.saveCommodity(commodity);
        return success("添加成功");
    }

    @GetMapping("shopping/delete_commodity")
    public ResponseVo deleteCommodity(Integer commodityId){
        service.deleteCommodity(commodityId);
        return success("删除成功");
    }

    @GetMapping
    public ResponseVo updateCommodity(Commodity commodity){
        service.updateCommodity(commodity);
        return success("修改成功");
    }
}