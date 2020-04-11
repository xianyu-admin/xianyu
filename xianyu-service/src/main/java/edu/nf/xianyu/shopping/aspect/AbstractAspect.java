package edu.nf.xianyu.shopping.aspect;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author LWP
 * @date 2020/3/31
 */
public class AbstractAspect {
    @Pointcut("execution(* edu.nf.xianyu.shopping.impl.CommodityServiceImpl.saveCommodity(..))")
    protected void addEs(){}
}