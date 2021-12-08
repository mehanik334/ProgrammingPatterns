package com.Denisenko.behavioral.strategy;

public class Car {

    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.doIt();
    }
}
