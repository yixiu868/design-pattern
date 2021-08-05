package com.ww.strategy.learn.demo2;

public class PeopleFactory {

    public People getPeople(String name) {
        if (name.equals("xm")) {
            return new Xiaoming();
        } else if (name.equals("xh")) {
            return new Xiaohong();
        }

        return null;
    }
}
