package com.ww.prototype;

public interface Prototype {

    /**
     * 克隆自身的方法
     * @return
     */
    Prototype clone();

    String getName();

    void setName(String name);
}
