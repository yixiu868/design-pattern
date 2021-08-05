package com.ww.factory.abstractfactory;

/**
 * @Description TODO
 * @Author wanggw
 * @Date 2020/5/18 10:48
 */
public class NorthFruitFactory implements FruitFactory {

    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NorthBanana();
    }
}
