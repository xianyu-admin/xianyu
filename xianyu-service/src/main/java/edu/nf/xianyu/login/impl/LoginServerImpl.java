package edu.nf.xianyu.login.impl;

import com.github.pagehelper.PageInfo;
import edu.nf.xianyu.exception.XianyuException;
import edu.nf.xianyu.login.LoginService;
import edu.nf.xianyu.login.dao.LoginDao;
import edu.nf.xianyu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author LWP
 * @date 2020/3/6
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
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

    @Override
    public PageInfo<User> listUser(Integer pageNum, Integer pageSize) {
        try{
            PageInfo<User> pageInfo = new PageInfo<>(dao.getUser(pageNum,pageSize));
            return pageInfo;
        }catch(Exception e){
            throw new XianyuException("服务器错误");
        }
    }

    @Override
    public void deleteUser(int userId) {
        try{
            dao.deleteUser(userId);
        }catch(Exception e){
            throw new XianyuException("服务器错误");
        }

    }

    @Override
    public void updateUser(User user) {
        try{
            dao.updateUser(user);
        }catch(Exception e){
            throw new XianyuException("服务器错误");
        }
    }

    @Override

    public void saveUser(User user) {
        try{
            dao.saveUser(user);
        }catch(Exception e){
            throw new XianyuException("服务器错误");
        }
    }
}