package com.wurc.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationDiy {
    @After("execution(* com.wurc.serivce.UserServiceImp.*(..))")
    public void after(){
        System.out.println("--方法执行后--");
    }
    @Before("execution(* com.wurc.serivce.UserServiceImp.*(..))")
    public void before(){
        System.out.println("--方法执行前--");
    }
    @Around("execution(* com.wurc.serivce.UserServiceImp.*(..))")
    public void around(){
        System.out.println("环绕前");
    }
}
