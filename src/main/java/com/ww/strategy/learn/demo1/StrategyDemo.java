package com.ww.strategy.learn.demo1;

public class StrategyDemo {

    public static void main(String[] args) {
        new PlayContext(new Hundouluo()).trigger();
        new UninstallContext(new Hundouluo()).trigger();

        new PlayContext(new Maxituan()).trigger();
        new UninstallContext(new Maxituan()).trigger();
    }
}
