package edu.nf.xianyu.discuss.impl;

import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.discuss.CommodityDiscussService;
import edu.nf.xianyu.discuss.dao.CommodityDiscussDao;
import edu.nf.xianyu.entity.CommodityDiscuss;
import edu.nf.xianyu.exception.XianyuException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Administrator
 * @date 2020/4/7
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class CommodityDiscussServiceImpl implements CommodityDiscussService {

    @Autowired
    CommodityDiscussDao dao;

    @Override
    public PageInfo<CommodityDiscuss> getCommodityDiscuss(Integer pageNum, Integer pageSize) {
        try {
            PageInfo<CommodityDiscuss> pageInfo = new PageInfo<>(dao.getCommodityDiscuss(pageNum, pageSize));
            return pageInfo;
        } catch (Exception e) {
            throw new XianyuException("服务器错误");
        }
    }

    @Override
    public void deleteCommodityDisxussById(Integer id) {
        try {
            dao.deleteCommodityDiscussById(id);
        } catch (Exception e) {
            throw new XianyuException("服务器错误");
        }
    }
}
