package com.ww.strategy.learn.demo2;

public class Xiaoming implements People {

    @Override
    public void eat() {
        System.out.println("小明吃饭");
    }

    @Override
    public void run() {
        System.out.println("小明跑步");
    }

    @Override
    public void wear() {
        System.out.println("小明穿衣");
    }
}
