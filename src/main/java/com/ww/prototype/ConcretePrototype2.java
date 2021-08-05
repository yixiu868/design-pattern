package com.ww.prototype;

public class ConcretePrototype2 implements Prototype {

    private String name;

    /**
     * 最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
     * @return
     */
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype2();
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
        return "ConcretePrototype2{" +
                "name='" + name + '\'' +
                '}';
    }
}
