package com.ww.strategy.learn.demo1;

public class Maxituan implements Game {

    @Override
    public void play() {
        System.out.println("游戏：马戏团...playing");
    }

    @Override
    public void uninstall() {
        System.out.println("游戏：马戏团...卸载");
    }
}
