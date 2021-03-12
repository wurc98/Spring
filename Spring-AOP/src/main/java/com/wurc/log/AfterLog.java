package com.wurc.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
/**
 *
 * @param returnValue 返回值
 * @param method  目标对象方法
 * @param args   参数
 * @param target  目标
 * @return void
 * @author wurc
 * @creed: Talk is cheap,show me the code
 * @date 2021/3/10 9:52
 */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"，返回结果为"+returnValue);
    }
}
