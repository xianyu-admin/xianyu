package edu.nf.xianyu.controller;

import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.categroy.CategroyService;
import edu.nf.xianyu.controller.vo.ResponseVo;
import edu.nf.xianyu.entity.Categroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2020-04-07
 */
@RestController
public class CategroyController extends BaseController {

    @Autowired
    private CategroyService service;

    @GetMapping("categroy/list_categroy")
    public ResponseVo <PageInfo<Categroy>> listCategroy(Integer pageNum , Integer pageSize){
        PageInfo<Categroy> pageInfo = service.listCategroy(pageNum, pageSize);
        return success(pageInfo);
    }

    @GetMapping("categroy/insert_categroy")
    public ResponseVo insertCategroy(Categroy categroy){
        service.saveCategroy(categroy);
        return success("添加成功");
    }

    @GetMapping("categroy/delete_categroy")
    public ResponseVo deteleCategroy(Integer categroyId){
        service.deleteCategroy(categroyId);
        return success("删除成功");
    }

    @GetMapping("categroy/update_categroy")
    public ResponseVo updateCategroy(Integer categroyId , Categroy categroy){
        service.updateCategroy(categroyId, categroy);
        return success("修改成功");
    }
}