package org.rsd.day1;

public class FruitProxy2 implements IFruit{

    private static IFruit fruit;

   public static FruitProxy2 getProxy(IFruit iFruit){
       fruit=iFruit;
       return new FruitProxy2();
   }
    @Override
    public void sale() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        fruit.sale();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
}
