package com.ww.factory.abstractfactory;

/**
 * @Description TODO
 * @Author wanggw
 * @Date 2020/5/18 10:48
 */
public class SouthApple extends Apple {

    @Override
    public void get() {
        System.out.println("南方的苹果，怕是长不出来哟");
    }
}
