package com.ww.iterator;

public class Test {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add("晓明");
        aggregate.add("小新");
        aggregate.add("小刚");

        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println((String)iterator.next());
        }
    }
}
