package com.ww.factory.simple;

/**
 * @Description TODO
 * @Author wanggw
 * @Date 2020/5/13 10:42
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
