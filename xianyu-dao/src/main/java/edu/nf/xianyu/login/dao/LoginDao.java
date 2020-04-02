package edu.nf.xianyu.login.dao;

import edu.nf.xianyu.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author LWP
 * @date 2020/3/6
 */
public interface LoginDao {

    User userLogin(String userName,String password);
    List<User> getUser(@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize);
    void deleteUser(int userId);
    void updateUser(User user);
    void saveUser(User user);

}