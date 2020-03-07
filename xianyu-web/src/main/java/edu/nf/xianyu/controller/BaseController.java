package edu.nf.xianyu.controller;

import edu.nf.xianyu.controller.vo.ResponseVo;

/**
 * @author LWP
 * @date 2020/3/4
 */
public class BaseController<T> {

    public ResponseVo<T> success(T data){
        ResponseVo vo = new ResponseVo();
        vo.setCode(200);
        vo.setData(data);
        return vo;
    }

    public ResponseVo<T> error(Object message){
        ResponseVo vo = new ResponseVo();
        vo.setCode(500);
        vo.setMessage(message);
        return vo;
    }
}