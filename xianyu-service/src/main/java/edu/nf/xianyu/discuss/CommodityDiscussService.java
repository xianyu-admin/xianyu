package edu.nf.xianyu.discuss;

import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.entity.CommodityDiscuss;

/**
 * @author Administrator
 * @date 2020/4/7
 */
public interface CommodityDiscussService {

    PageInfo<CommodityDiscuss> getCommodityDiscuss(Integer pageNum,Integer pageSize);

    void deleteCommodityDiscussById(Integer id);

    void saveCommodityDiscuss(CommodityDiscuss commodityDiscuss);
}
