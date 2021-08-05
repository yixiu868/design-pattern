package com.ww.factory.abstractfactory.factory;

import com.ww.factory.abstractfactory.product.Fruit;
import com.ww.factory.abstractfactory.product.InnerApple;
import com.ww.factory.abstractfactory.product.InnerBanana;

/**
 * @Description 大棚水果生产工厂：具体工厂
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
