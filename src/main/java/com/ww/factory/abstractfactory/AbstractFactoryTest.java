package com.ww.factory.abstractfactory;

/**
 * @Description TODO
 * @Author wanggw
 * @Date 2020/5/18 10:51
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        FruitFactory fruitFactory = new NorthFruitFactory();
        Fruit apple = fruitFactory.getApple();
        apple.get();
        Fruit banana = fruitFactory.getBanana();
        banana.get();

        System.out.println("------------------------------");

        FruitFactory south = new SouthFruitFactory();
        Fruit apple2 = south.getApple();
        Fruit banana2 = south.getBanana();
        apple2.get();
        banana2.get();

        System.out.println("------------------------------");

        FruitFactory inner = new InnerFruitFactory();
        Fruit apple3 = inner.getApple();
        Fruit banana3 = inner.getBanana();
        apple3.get();
        banana3.get();
    }
}
