package com.ww.adapter;

public class EnglishTransactor implements EnglishSpeaker {

    private UKPrime ukPrime;

    public EnglishTransactor(UKPrime ukPrime) {
        this.ukPrime = ukPrime;
    }

    @Override
    public void englishSpeaker() {
        System.out.println("英文翻译准备中");
        ukPrime.talk();
        System.out.println("英文翻译完毕");
    }
}
