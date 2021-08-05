package com.ww.strategy;

public class Test {

    public static void main(String[] args) {
        Context context = new Context("", 100.0, 0.0, 0.0);
        Context context1 = new Context("折扣", 100.0, 0.0, 0.6);
        System.out.println(context.getResult());
        System.out.println(context1.getResult());
    }
}
