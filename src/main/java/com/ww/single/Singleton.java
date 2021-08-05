package com.ww.single;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {}

    public static Singleton getSingleton() {
        if (null == singleton) {
            singleton = new Singleton();
        }

        return singleton;
    }
}
