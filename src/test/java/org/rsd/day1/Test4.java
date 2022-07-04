package org.rsd.day1;

import org.junit.jupiter.api.Test;
public class Test4 {

    @Test
    public void test1() {
        Apple apple = new Apple();
        Pear pear = new Pear();
        FruitProxy fruitProxy = new FruitProxy(pear);
        fruitProxy.sale();
    }

    @Test
    public void test2() {
        Apple apple = new Apple();
        FruitProxy2 proxy = FruitProxy2.getProxy(apple);
        proxy.sale();

    }

    @Test
    public void test3() {
        Apple apple = new Apple();
        FruitProxy2_1 proxy = new FruitProxy2_1(apple);


    }

    @Test
    public void test4() {
        Apple apple = new Apple();
        FruitProxy2_1 proxy = new FruitProxy2_1(apple);

    }

}
