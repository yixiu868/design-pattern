package com.ww.observer;

public class ConcreteObserver implements Observer {

    private ConcreteSubject subject;
    private String publishText;
    private String name;

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;
    }



    @Override
    public void update() {
        publishText = subject.getPublicText();
        System.out.println("观察者[" + name + "], 接收到\"" + publishText + "\"变更通知");
    }
}
