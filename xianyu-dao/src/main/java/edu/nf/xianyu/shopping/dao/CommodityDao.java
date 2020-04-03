package edu.nf.xianyu.shopping.dao;

import edu.nf.xianyu.entity.Commodity;
import edu.nf.xianyu.entity.UserCommid;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LWP
 * @date 2020/3/12
 */
public interface CommodityDao {

    List<Commodity> getCommodity(@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize);
    void saveCommodity(Commodity commodity);


}