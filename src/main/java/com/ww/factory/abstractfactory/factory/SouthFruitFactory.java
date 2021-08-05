package com.ww.factory.abstractfactory.factory;

import com.ww.factory.abstractfactory.product.Fruit;
import com.ww.factory.abstractfactory.product.SouthApple;
import com.ww.factory.abstractfactory.product.SouthBanana;

/**
 * @Description 南方水果种植基地：具体工厂
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
