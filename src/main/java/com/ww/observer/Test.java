package com.ww.observer;

public class Test {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserver(subject, "李逵"));
        subject.attach(new ConcreteObserver(subject, "鲁智深"));
        subject.attach(new ConcreteObserver(subject, "张珊珊"));

        subject.setPublicText("老板来了");
        subject.publish();
    }
}
