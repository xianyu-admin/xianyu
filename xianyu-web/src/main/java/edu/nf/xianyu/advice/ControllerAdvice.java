package edu.nf.xianyu.advice;

import edu.nf.xianyu.controller.vo.ResponseVo;
import edu.nf.xianyu.exception.XianyuException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author LWP
 * @date 2020/3/5
 */
@RestControllerAdvice("edu.nf.xianyu.controller")
public class ControllerAdvice {

    @ExceptionHandler(XianyuException.class)
    public ResponseVo error(XianyuException e){
        ResponseVo vo = new ResponseVo();
        vo.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        vo.setMessage(e.getMessage());
        return vo;
    }
}
