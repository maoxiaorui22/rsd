package org.rsd.day1;

public class FruitProxy implements IFruit{

    private IFruit fruit;
    public FruitProxy(IFruit fruit){
        this.fruit=fruit;
    }

    @Override
    public void sale() {
        System.out.println("-------------------");
        fruit.sale();
        System.out.println("*******************");
    }
}
