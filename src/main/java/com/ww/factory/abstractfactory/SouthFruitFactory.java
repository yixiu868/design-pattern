package com.ww.factory.abstractfactory;

/**
 * @Description TODO
 * @Author wanggw
 * @Date 2020/5/18 10:50
 */
public class SouthFruitFactory implements FruitFactory {

    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }
}
