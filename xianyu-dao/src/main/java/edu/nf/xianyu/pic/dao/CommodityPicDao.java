package edu.nf.xianyu.pic.dao;

import edu.nf.xianyu.entity.CommodityPic;

import java.util.List;

/**
 * @author LWP
 * @date 2020/4/16
 */
public interface CommodityPicDao {

    List<CommodityPic> getCommodityPic();
    CommodityPic getCommodityPicById(Integer commodityId);
}