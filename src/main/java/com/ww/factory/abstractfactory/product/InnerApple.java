package com.ww.factory.abstractfactory.product;

/**
 * @Description 大棚苹果：具体产品
 * @Author wanggw
 * @Date 2020/5/18 10:44
 */
public class InnerApple extends Apple {

    @Override
    public void get() {
        System.out.println("温室内的苹果");
    }
}
