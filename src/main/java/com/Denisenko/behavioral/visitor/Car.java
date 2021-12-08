package com.Denisenko.behavioral.visitor;

public class Car implements CarElement {

    private CarElement[] carElements;

    public Car() {
        this.carElements = new CarElement[]{new Engine(),new Transmission(),new BodyCar()};
    }

    @Override
    public void beCollect(Mechanic mechanic) {
        for(CarElement carElement: carElements) {
            carElement.beCollect(mechanic);
        }
    }
}
