package com.ww.single;

/**
 * @author xiaohua
 * @date 2020/9/20 15:12
 */
public class LazySingleton {

    private volatile static LazySingleton instance = null;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        // 第一重判断
        if (null == instance) {
            // 锁定代码块
            synchronized (LazySingleton.class) {
                // 第二重判断
                if (null == instance) {
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }
}
