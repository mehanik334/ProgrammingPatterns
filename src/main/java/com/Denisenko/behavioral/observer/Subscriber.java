package com.Denisenko.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + "\n We have some changes in vacancies:\n" + vacancies);
    }
}
