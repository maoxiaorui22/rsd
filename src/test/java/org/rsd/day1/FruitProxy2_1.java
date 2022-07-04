package org.rsd.day1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class FruitProxy2_1 implements InvocationHandler {
    private IFruit fruit;

    public FruitProxy2_1 (IFruit iFruit){
        this.fruit=iFruit;
        Proxy.newProxyInstance(fruit.getClass().getClassLoader(), fruit.getClass().getInterfaces(), this);

    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        Object invoke = method.invoke(fruit, args);
        System.out.println("****************************");
        return invoke;

    }
}
