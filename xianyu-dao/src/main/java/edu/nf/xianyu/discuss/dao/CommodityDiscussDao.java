package edu.nf.xianyu.discuss.dao;

import edu.nf.xianyu.entity.CommodityDiscuss;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/4/7
 */
public interface CommodityDiscussDao {

    /**
     * 评论列表
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<CommodityDiscuss> getCommodityDiscuss(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);

    /**
     * 删除评论
     * @param id
     */
    void deleteCommodityDiscussById(Integer id);
}
