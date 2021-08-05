package com.ww.factory.simple;

/**
 * @Description TODO
 * @Author wanggw
 * @Date 2020/5/13 10:51
 */
public class Test {

    public static void main(String[] args) {
        SimpleFactory.generateShape("circle").display();
        SimpleFactory.generateShape("rectangle").display();
    }
}
