package com.Denisenko.structural.proxy;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new ProxyCar(10000);
        car.drive();
    }
}
