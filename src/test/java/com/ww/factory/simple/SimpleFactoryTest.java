package com.ww.factory.simple;

import org.junit.Test;

/**
 * @Description: 简单工厂测试
 * @author xiaohua
 * @date 2021年8月5日 下午4:27:53
 */
public class SimpleFactoryTest {

    @Test
    public void test01() {
        SimpleFactory.generateShape("circle").display();
        SimpleFactory.generateShape("rectangle").display();
    }
}
