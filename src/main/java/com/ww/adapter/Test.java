package com.ww.adapter;

public class Test {

    public static void main(String[] args) {
        ChinaChairman chinaChairman = new ChinaChairman();
        ChinseseTransactor chinseseTransactor = new ChinseseTransactor(chinaChairman);
        UKPrime ukPrime = new UKPrime();
        EnglishTransactor englishTransactor = new EnglishTransactor(ukPrime);

        // 开始会谈
        chinseseTransactor.chineseSpeaker();
        System.out.println("-------------");
        englishTransactor.englishSpeaker();
    }
}
