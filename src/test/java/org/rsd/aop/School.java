package org.rsd.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;


public class School implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("******************");

    }
}
