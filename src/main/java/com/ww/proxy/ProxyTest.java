package com.ww.proxy;

public class ProxyTest {

    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl();
        mm.setName("万人迷");

        Proxy proxy = new Proxy(mm);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveFlowers();
    }
}
