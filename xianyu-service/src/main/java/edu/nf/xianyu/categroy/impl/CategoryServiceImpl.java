package edu.nf.xianyu.categroy.impl;

import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.categroy.CategroyService;
import edu.nf.xianyu.categroy.dao.CategroyDao;
import edu.nf.xianyu.entity.Categroy;
import edu.nf.xianyu.exception.XianyuException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Administrator
 * @date 2020-04-07
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class CategoryServiceImpl implements CategroyService {

    private static final Logger log = LoggerFactory.getLogger(CategoryServiceImpl.class);
    @Autowired
    private CategroyDao dao;

    @Override
    public void saveCategroy(Categroy categroy) {
        try{
            dao.saveCategroy(categroy);
            log.info("添加成功");
        }catch (Exception e){
            e.printStackTrace();
            throw new XianyuException("服务器内部出错，添加失败");
        }
    }

    @Override
    public PageInfo<Categroy> listCategroy(Integer pageNum, Integer pageSize) {
        try{
            List<Categroy> list = dao.listCategroy(pageNum, pageSize);
            PageInfo<Categroy> pageInfo = new PageInfo<>(list);
            return pageInfo;
        }catch (Exception e){
            e.printStackTrace();
            throw new XianyuException("服务器内部出错，无法查询");
        }
    }

    @Override
    public void deleteCategroy(Integer categroyId) {
        try{
            dao.deleteCategroy(categroyId);
        }catch (Exception e){
            e.printStackTrace();
            throw new XianyuException("服务器内部错误，删除失败");
        }
    }

    @Override
    public void updateCategroy(Integer categroyId,Categroy categroy) {
        try{
            dao.updateCategroy(categroyId,categroy);
        }catch (Exception e){
            e.printStackTrace();
            throw new XianyuException("服务器内部异常，修改失败");
        }
    }
}