package com.ww.strategy.learn.demo1;

public class Default implements Game {

    @Override
    public void play() {
        System.out.println("游戏：俄罗斯方块...playing");
    }

    @Override
    public void uninstall() {
        System.out.println("游戏：俄罗斯方块...卸载");
    }
}
