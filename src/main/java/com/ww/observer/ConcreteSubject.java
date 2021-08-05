package com.ww.observer;

public class ConcreteSubject extends Subject {

    private String publicText;

    public String getPublicText() {
        return publicText;
    }

    public void setPublicText(String publicText) {
        this.publicText = publicText;
    }
}
