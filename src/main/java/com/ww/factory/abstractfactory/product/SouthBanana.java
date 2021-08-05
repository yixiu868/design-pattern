package com.ww.factory.abstractfactory.product;

/**
 * @Description 南方香蕉：具体产品
 * @Author wanggw
 * @Date 2020/5/18 10:49
 */
public class SouthBanana extends Banana {

    @Override
    public void get() {
        System.out.println("南方香蕉，长势喜人");
    }
}
