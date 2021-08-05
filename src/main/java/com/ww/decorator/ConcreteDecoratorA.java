package com.ww.decorator;

public class ConcreteDecoratorA extends Decorator {

    @SuppressWarnings("unused")
    private String addedState;

    @Override
    public void operation() {
        super.operation(); // 原Component进行操作

        addedState = "新状态";
        System.out.println("具体装饰对象A的操作");
    }
}
