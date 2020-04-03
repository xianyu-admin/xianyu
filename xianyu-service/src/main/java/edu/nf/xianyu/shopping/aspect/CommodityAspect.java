package edu.nf.xianyu.shopping.aspect;

import edu.nf.xianyu.shopping.CommodityService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author LWP
 * @date 2020/3/31
 */
@Aspect
@Component
public class CommodityAspect extends AbstractAspect {

    @Autowired
    private CommodityService service;

    @After("addEs()")
    public void addShopping(JoinPoint jp){

    }
}