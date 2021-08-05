package com.ww.factory.abstractfactory.product;

/**
 * @Description 大棚香蕉：具体产品
 * @Author wanggw
 * @Date 2020/5/18 10:45
 */
public class InnerBanana extends Banana {

    @Override
    public void get() {
        System.out.println("温室内的香蕉");
    }
}
