package com.ww.strategy.learn.demo2;

public class Xiaohong implements People {

    @Override
    public void eat() {
        System.out.println("小红吃饭");
    }

    @Override
    public void run() {
        System.out.println("小红跑步");
    }

    @Override
    public void wear() {
        System.out.println("小红穿衣");
    }
}
