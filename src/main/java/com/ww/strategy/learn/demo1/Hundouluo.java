package com.ww.strategy.learn.demo1;

public class Hundouluo implements Game {

    @Override
    public void play() {
        System.out.println("游戏：魂斗罗...playing");
    }

    @Override
    public void uninstall() {
        System.out.println("游戏：魂斗罗...卸载");
    }
}
