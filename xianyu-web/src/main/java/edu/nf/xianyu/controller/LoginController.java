package edu.nf.xianyu.controller;


import edu.nf.xianyu.controller.vo.ResponseVo;
import edu.nf.xianyu.login.LoginService;
import edu.nf.xianyu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LWP
 * @date 2020/3/6
 */
@RestController
public class LoginController extends BaseController {


    @Autowired
    private LoginService service;

    @GetMapping("/auth/login")
    public ResponseVo userLogin(String userName,String password){
        User user = service.userLogin(userName,password);
        return success(user);
    }

    @DeleteMapping("/auth/delete")
    public ResponseVo deleteUser(int userId){
        service.deleteUser(userId);
        System.out.println();
        return success("删除成功");
    }

    @PostMapping("/auth/update")
    public ResponseVo updateUser(User user){
        service.updateUser(user);
        return success("修改成功");
    }
}