package com.ww.factory.abstractfactory;

/**
 * @Description TODO
 * @Author wanggw
 * @Date 2020/5/18 10:45
 */
public class InnerFruitFactory implements FruitFactory {

    @Override
    public Fruit getApple() {
        return new InnerApple();
    }

    @Override
    public Fruit getBanana() {
        return new InnerBanana();
    }
}
