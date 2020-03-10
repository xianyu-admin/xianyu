package edu.nf.xianyu.login.service;

import edu.nf.xianyu.entity.User;

/**
 * @author LWP
 * @date 2020/3/6
 */

public interface LoginService {

    User userLogin(String userName,String password);
}