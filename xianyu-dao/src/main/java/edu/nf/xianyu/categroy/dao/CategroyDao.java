package edu.nf.xianyu.categroy.dao;

import edu.nf.xianyu.entity.Categroy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 * @date 2020-04-07
 */
public interface CategroyDao {
    void saveCategory(Categroy categroy);
    List<Categroy> listCategroy(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
    void deleteCategroy(@Param("categroyId") Integer categroyId);
    void updateCategroy(@Param("categroyId") Integer categroyId,Categroy categroy);
}