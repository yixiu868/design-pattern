package com.ww.factory.abstractfactory.factory;

import com.ww.factory.abstractfactory.product.Fruit;

/**
 * @Description: 抽象工厂
 * @author xiaohua
 * @date 2021年8月5日 下午4:47:49
 */
public interface FruitFactory {

    Fruit getApple();

    Fruit getBanana();
}
