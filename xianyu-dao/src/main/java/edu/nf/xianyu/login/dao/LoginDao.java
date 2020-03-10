package edu.nf.xianyu.login.dao;

import edu.nf.xianyu.entity.User;


/**
 * @author LWP
 * @date 2020/3/6
 */
public interface LoginDao {
    User userLogin(String userName,String password);
}