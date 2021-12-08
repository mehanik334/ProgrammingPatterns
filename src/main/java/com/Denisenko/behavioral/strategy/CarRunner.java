package com.Denisenko.behavioral.strategy;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();

        car.setActivity(new Parking());
        car.executeActivity();

        car.setActivity(new Riding());
        car.executeActivity();

        car.setActivity(new Braking());
        car.executeActivity();

        car.setActivity(new Parking());
        car.executeActivity();
    }
}
