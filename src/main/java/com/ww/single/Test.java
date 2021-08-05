package com.ww.single;

public class Test {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();

        if (singleton1 == singleton2) {
            System.out.println("地址都一样，肯定是一个实例了");
        }
    }
}
