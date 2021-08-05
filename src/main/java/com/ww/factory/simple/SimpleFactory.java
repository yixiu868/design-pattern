package com.ww.factory.simple;

/**
 * @Description: 简单工厂方法
 * @author xiaohua
 * @date 2021年8月5日 下午4:29:20
 */
public class SimpleFactory {

    public static Shape generateShape(String name) {
        Shape shape = null;
        switch (name) {
            case "circle":
                shape = new Circle();
                break;
            case "rectangle":
                shape = new Rectangle();
                break;
        }

        return shape;
    }
}
