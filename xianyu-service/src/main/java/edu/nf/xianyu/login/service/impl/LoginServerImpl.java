package edu.nf.xianyu.login.service.impl;

import edu.nf.xianyu.exception.XianyuException;
import edu.nf.xianyu.login.dao.LoginDao;
import edu.nf.xianyu.login.service.LoginService;
import edu.nf.xianyu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author LWP
 * @date 2020/3/6
 */
@Service
public class LoginServerImpl implements LoginService {

    @Autowired
    private LoginDao dao;

    @Override
    @Cacheable(value = "cache1",key = "#userName")
    public User userLogin(String userName,String password) {
        User user = dao.userLogin(userName,password);
        if(user==null){
            throw new XianyuException("账号或密码错误！");
        }else {
            return user;
        }
    }
}