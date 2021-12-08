package com.Denisenko.behavioral.visitor;

public class SimpleMechanic implements Mechanic {
    @Override
    public void create(Engine engine) {
        System.out.println("Collect bad engine");
    }

    @Override
    public void create(BodyCar bodyCar) {
        System.out.println("Collect not good body car");
    }

    @Override
    public void create(Transmission transmission) {
        System.out.println("Collect simply transmission");
    }
}
