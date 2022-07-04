package org.rsd.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Tools {

    public void  before(){
        System.out.println("^^^^^^^^^^^之前^^^^^^^^^^^^");
    }


    public void  after(){
        System.out.println("^^^^^^^^^^^^^之后^^^^^^^^^^^^");
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("^^^^^^^^^^^开始^^^^^^^^^^^");
        Object o = joinPoint.proceed();
        System.out.println("^^^^^^^^^^^结束^^^^^^^^^^^");
        return o;

    }
}
