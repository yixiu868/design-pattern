package com.ww.strategy.learn.demo2;

public class StrategySign {

    private People people;

    public StrategySign(People people) {
        this.people = people;
    }

    public StrategySign(String name) {
        if (name.equals("xm")) {
            people = new Xiaoming();
        } else if (name.equals("xh")) {
            people = new Xiaohong();
        }
    }

    public void run() {
        people.eat();
        people.run();
        people.eat();
    }
}
