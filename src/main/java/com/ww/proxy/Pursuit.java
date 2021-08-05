package com.ww.proxy;

public class Pursuit implements GiveGift {

    private SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println("送给" + mm.getName() + ", 洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println("送给" + mm.getName() + ", 鲜花");
    }

    @Override
    public void giveChocolates() {
        System.out.println("送给" + mm.getName() + ", 巧克力");
    }
}
