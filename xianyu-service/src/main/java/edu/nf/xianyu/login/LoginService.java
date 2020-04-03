package edu.nf.xianyu.login;

import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.entity.User;

import java.util.List;

/**
 * @author LWP
 * @date 2020/3/6
 */

public interface LoginService {

    User userLogin(String userName,String password);
    PageInfo<User> listUser(Integer pageNum, Integer pageSize);
    void deleteUser(int userId);
    void updateUser(User user);
    void saveUser(User user);
}