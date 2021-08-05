package com.ww.factory.abstractfactory;

/**
 * @Description TODO
 * @Author wanggw
 * @Date 2020/5/18 10:45
 */
public class InnerBanana extends Banana {

    @Override
    public void get() {
        System.out.println("温室内的香蕉");
    }
}
