package com.Denisenko.creational.builder;

public abstract class ComputerBuilder {
    Computer computer;

    public void createComputer() {
        computer = new Computer();
    }

    public abstract void buildCpu();
    public abstract void buildHdd();
    public abstract void buildPrice();

    public Computer getComputer() {
        return computer;
    }
}
