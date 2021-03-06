package edu.nf.xianyu.shopping.impl;

import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.config.EsConfig;
import edu.nf.xianyu.exception.XianyuException;
import edu.nf.xianyu.shopping.CommodityService;
import edu.nf.xianyu.entity.Commodity;
import edu.nf.xianyu.shopping.dao.CommodityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

/**
 * @author LWP
 * @date 2020/3/23
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityDao dao;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @Cacheable(value = "cache1")
    public PageInfo<Commodity> getCommodity(Integer pageNum,Integer pageSize) {
        try{
            PageInfo<Commodity> pageInfo = new PageInfo<>(dao.getCommodity(pageNum,pageSize));
            return pageInfo;
        }catch(Exception e){
            throw new XianyuException("服务器错误");
        }
    }

    @Override
    public String getEsCommodity(String url) {
        try{
            String rest = restTemplate.getForObject(url,String.class);
            return rest;
        }catch(Exception e){
            throw new XianyuException("服务器错误");
        }

    }

    @Override
    public void saveCommodity(Commodity commodity) {
        try{
            dao.saveCommodity(commodity);
        }catch(Exception e){
            throw new XianyuException("服务器错误");
        }
    }

    @Override
    public void deleteCommodity(Integer commodityId) {
        try{
            dao.deleteCommodity(commodityId);
        }catch(Exception e){
            throw new XianyuException("服务器错误");
        }
    }

    @Override
    public void updateCommodity(Commodity commodity) {
        try{
            dao.updateCommodity(commodity);
        }catch(Exception e){
            throw new XianyuException("服务器错误");
        }
    }
}