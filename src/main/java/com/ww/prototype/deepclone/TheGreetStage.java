package com.ww.prototype.deepclone;

import java.io.IOException;

public class TheGreetStage {

    private Monkey monkey = new Monkey();

    public void change() throws IOException, ClassNotFoundException {
        Monkey copyMonkey = (Monkey)monkey.deepClone();
        System.out.println("大圣本尊的生日是：" + monkey.getBirthDate());
        System.out.println("克隆的大圣的生日是：" + monkey.getBirthDate());
        System.out.println("大圣本尊跟克隆的大圣是否为同一个对象 " + (monkey == copyMonkey));
        System.out.println("大圣本尊持有的金箍棒 跟 克隆的大圣持有的金箍棒是否为同一个对象？ " + (monkey.getStaff() == copyMonkey.getStaff()));
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TheGreetStage stage = new TheGreetStage();
        stage.change();
    }
}
