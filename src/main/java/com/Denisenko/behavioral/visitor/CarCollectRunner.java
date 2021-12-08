package com.Denisenko.behavioral.visitor;

public class CarCollectRunner {
    public static void main(String[] args) {
        Car car = new Car();

        Mechanic simpleMechanic = new SimpleMechanic();
        Mechanic engineerMechanic = new EngineerMechanic();

        System.out.println("Simple mechanic collect the car");
        car.beCollect(simpleMechanic);
        System.out.println("Engineer mechanic collect the car");
        car.beCollect(engineerMechanic);
    }
}
