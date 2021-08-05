package com.ww.factory.abstractfactory.factory;

import com.ww.factory.abstractfactory.product.Fruit;
import com.ww.factory.abstractfactory.product.NorthApple;
import com.ww.factory.abstractfactory.product.NorthBanana;

/**
 * @Description 北方水果种植基地：具体工厂
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
