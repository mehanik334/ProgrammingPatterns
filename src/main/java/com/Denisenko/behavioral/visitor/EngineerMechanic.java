package com.Denisenko.behavioral.visitor;

public class EngineerMechanic implements Mechanic{
    @Override
    public void create(Engine engine) {
        System.out.println("Collect good engine");
    }

    @Override
    public void create(BodyCar bodyCar) {
        System.out.println("Collect good body car");
    }

    @Override
    public void create(Transmission transmission) {
        System.out.println("Collect 4x4 transmission ");
    }
}
