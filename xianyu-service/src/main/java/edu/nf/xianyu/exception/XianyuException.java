package edu.nf.xianyu.exception;

/**
 * @author LWP
 * @date 2020/3/5
 */

public class XianyuException extends RuntimeException {

    public XianyuException(String message) {
        super(message);
    }

    public XianyuException(String message, Throwable cause) {
        super(message, cause);
    }

    public XianyuException(Throwable cause) {
        super(cause);
    }
}