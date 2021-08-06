package com.ww.proxy.dynamic.cglib;

/**
 * @Description CGLib代理类不能是final，代理的方法也不能是final（继承限制）
 * @Author wanggw
 * @Date 2020/5/11 10:22
 */
public class MyTarget {

    public void printName() {
        System.out.println("name: Target-");
    }
}
