package edu.nf.xianyu.commodityPic.impl;

import edu.nf.xianyu.commodityPic.CommodityPicService;
import edu.nf.xianyu.entity.CommodityPic;
import edu.nf.xianyu.exception.XianyuException;
import edu.nf.xianyu.pic.dao.CommodityPicDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * @author LWP
 * @date 2020/4/16
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class CommodityPicServiceImpl implements CommodityPicService {

    @Autowired
    private CommodityPicDao commodityPicDao;

    @Override
    public List<CommodityPic> getCommodityPic() {
        try{
            return commodityPicDao.getCommodityPic();
        }catch(Exception e){
            throw new XianyuException("服务器异常");
        }
    }

    @Override
    public CommodityPic getCommodityPicById(Integer commodityId) {
        try{
            return commodityPicDao.getCommodityPicById(commodityId);
        }catch(Exception e){
            throw new XianyuException("服务器异常");
        }
    }
}