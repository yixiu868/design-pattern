package com.ww.strategy.learn.demo2;

/**
 * 工厂模式与策略模式区别，工厂模式强调生成不同实例，策略模式强调不同实例的行为
 */
public class TestSign {

    public static void main(String[] args) {
        PeopleFactory peopleFactory = new PeopleFactory();
        People people = peopleFactory.getPeople("xh");
        System.out.print("工厂模式---");
        people.eat();
        System.out.print("工厂模式---");
        people.run();
        System.out.print("工厂模式---");
        people.eat();

        StrategySign strategySign = new StrategySign("xh");
        System.out.println("策略模式---");
        strategySign.run();
    }
}
