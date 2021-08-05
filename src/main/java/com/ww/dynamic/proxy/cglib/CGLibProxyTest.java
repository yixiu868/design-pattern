package com.ww.dynamic.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @Description TODO
 * @Author wanggw
 * @Date 2020/5/11 10:43
 */
public class CGLibProxyTest {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MyTarget.class);
        enhancer.setCallback(new MyInterceptor());
        MyTarget myTarget = (MyTarget) enhancer.create();
        myTarget.printName();
        System.out.println("代理类名:" + myTarget.getClass().getName());
    }
}
