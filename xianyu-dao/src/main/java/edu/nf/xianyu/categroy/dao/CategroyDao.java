package edu.nf.xianyu.categroy.dao;

import edu.nf.xianyu.entity.Categroy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 * @date 2020-04-07
 */
public interface CategroyDao {
    void saveCategroy(Categroy categroy);
    List<Categroy> listCategroy(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
}