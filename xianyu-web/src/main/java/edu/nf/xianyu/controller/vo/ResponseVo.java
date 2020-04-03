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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}