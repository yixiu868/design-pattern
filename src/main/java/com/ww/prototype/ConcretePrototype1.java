package com.ww.prototype;

public class ConcretePrototype1 implements Prototype {

    private String name;

    /**
     * 最简单的克隆，新建一个自身对象，由于没有属性就不在复制值了
     * @return
     */
    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "name='" + name + '\'' +
                '}';
    }
}
