package com.ww.factory.abstr;

import org.junit.Test;

import com.ww.factory.abstractfactory.factory.FruitFactory;
import com.ww.factory.abstractfactory.factory.InnerFruitFactory;
import com.ww.factory.abstractfactory.factory.NorthFruitFactory;
import com.ww.factory.abstractfactory.factory.SouthFruitFactory;
import com.ww.factory.abstractfactory.product.Fruit;

/**
 * @Description: 抽象工厂测试程序
 * @author xiaohua
 * @date 2021年8月5日 下午4:44:04
 */
public class AbstractFactoryTest {

    @Test
    public void test01() {
        // 北方种植
        FruitFactory fruitFactory = new NorthFruitFactory();
        Fruit apple = fruitFactory.getApple();
        Fruit banana = fruitFactory.getBanana();
        apple.get();
        banana.get();

        System.out.println("------------------------------");

        // 南方种植
        FruitFactory south = new SouthFruitFactory();
        Fruit apple2 = south.getApple();
        Fruit banana2 = south.getBanana();
        apple2.get();
        banana2.get();

        System.out.println("------------------------------");

        // 大棚种植
        FruitFactory inner = new InnerFruitFactory();
        Fruit apple3 = inner.getApple();
        Fruit banana3 = inner.getBanana();
        apple3.get();
        banana3.get();
    }
}
