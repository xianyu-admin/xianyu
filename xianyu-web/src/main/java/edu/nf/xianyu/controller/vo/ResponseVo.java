package edu.nf.xianyu.controller.vo;

import lombok.Data;

/**
 * @author LWP
 * @date 2020/3/4
 */
@Data
public class ResponseVo<T> {

    private Integer code;
    private Object message;
    private T data;
}