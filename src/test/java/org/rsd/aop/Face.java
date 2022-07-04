package org.rsd.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Face {
    @Pointcut("execution(* org.rsd.service.Impl.*.*(..))")
    private void pointcut(){

    }

    @Before("pointcut()")
    public void before(){
        System.out.println("&&&&&&&&&&&&&& 前置 &&&&&&&&&&&&&");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("&&&&&&&&&&&&&& 后置 &&&&&&&&&&&&&");
    }

    @Around("execution(* org.rsd.service.Impl.*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("&&&&&&&&&&&&&&&&&& 环绕（start）&&&&&&&&&&&&&&&&&&&&&");
        Object proceed = joinPoint.proceed();
        System.out.println("&&&&&&&&&&&&&&&&&& 环绕（end）&&&&&&&&&&&&&&&&&&&&&");
        return proceed;
    }
}
