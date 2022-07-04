package org.rsd.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Room implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("------------之前--------------");
        Object o = invocation.proceed();
        System.out.println("-------------之后-------------");
        return o;
    }
}
