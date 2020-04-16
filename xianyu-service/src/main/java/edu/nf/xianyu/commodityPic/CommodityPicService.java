package edu.nf.xianyu.commodityPic;

import edu.nf.xianyu.entity.Commodity;
import edu.nf.xianyu.entity.CommodityPic;

import java.util.List;

/**
 * @author LWP
 * @date 2020/4/16
 */
public interface CommodityPicService {

    List<CommodityPic> getCommodityPic();

    CommodityPic getCommodityPicById(Integer commodityId);
}