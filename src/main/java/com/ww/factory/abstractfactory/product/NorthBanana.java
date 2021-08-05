package com.ww.factory.abstractfactory.product;

/**
 * @Description 北方香蕉：具体产品
 * @Author wanggw
 * @Date 2020/5/18 10:47
 */
public class NorthBanana extends Banana {

    @Override
    public void get() {
        System.out.println("北方的香蕉，有点悬哟");
    }
}
