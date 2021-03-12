package com.wurc.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {

/**
 * 
 * @param method   要执行的目标对象的方法
 * @param objects  参数  args
 * @param o         目标对象
 * @return void
 * @author wurc
 * @creed: Talk is cheap,show me the code
 * @date 2021/3/10 9:47
 */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
