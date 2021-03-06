package edu.nf.xianyu.shopping;

import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.entity.Commodity;

/**
 * @author LWP
 * @date 2020/3/23
 */
public interface CommodityService {

    PageInfo<Commodity> getCommodity(Integer pageNum,Integer pageSize);

    void saveCommodity(Commodity commodity);

    void deleteCommodity(Integer commodityId);

    void updateCommodity(Commodity commodity);

    String getEsCommodity(String url);
}