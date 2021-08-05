package com.ww.factory.abstractfactory.product;

/**
 * @Description 北方苹果：具体产品
 * @Author wanggw
 * @Date 2020/5/18 10:46
 */
public class NorthApple extends Apple {

    @Override
    public void get() {
        System.out.println("北方的苹果");
    }
}
