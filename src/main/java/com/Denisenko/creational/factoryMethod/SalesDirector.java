package com.Denisenko.creational.factoryMethod;

public class SalesDirector implements Director {
    @Override
    public void manage() {
        System.out.println("Sales Director manages sales");
    }
}
