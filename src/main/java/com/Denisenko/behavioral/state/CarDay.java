package com.Denisenko.behavioral.state;

public class CarDay {
    public static void main(String[] args) {
        Activity activity = new Parking();
        Car car = new Car();
        car.setActivity(activity);

        for(int i = 0; i < 6; i++) {
            car.doIt();
            car.changeActivity();
        }
    }
}
