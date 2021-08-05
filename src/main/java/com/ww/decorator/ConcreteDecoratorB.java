package com.ww.decorator;

public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();

        addOperator();
        System.out.println("装饰器B操作完毕");
    }

    private void addOperator() {
        System.out.println("装饰器B装饰操作");
    }
}
