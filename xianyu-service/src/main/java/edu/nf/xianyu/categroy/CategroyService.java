package edu.nf.xianyu.categroy;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.entity.Categroy;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * @date 2020-04-07
 */
public interface CategroyService {
    void saveCategroy(Categroy categroy);
    PageInfo<Categroy> listCategroy(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
}