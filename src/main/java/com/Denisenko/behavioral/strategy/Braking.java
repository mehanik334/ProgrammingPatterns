package com.Denisenko.behavioral.strategy;

public class Braking implements Activity {
    @Override
    public void doIt() {
        System.out.println("Braking to the stop");
    }
}
