package com.ww.adapter;

public class ChinseseTransactor implements ChineseSpeaker {

    private ChinaChairman chinaChairman;

    public ChinseseTransactor(ChinaChairman chinaChairman) {
        this.chinaChairman = chinaChairman;
    }

    @Override
    public void chineseSpeaker() {
        System.out.println("中文翻译准备中");
        chinaChairman.talk();
        System.out.println("中文翻译完毕");
    }
}
