package com.Denisenko.behavioral.visitor;

public interface Mechanic {
    public void create(Engine engine);
    public void create(BodyCar bodyCar);
    public void create(Transmission transmission);
}
