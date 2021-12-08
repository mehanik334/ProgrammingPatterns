package com.Denisenko.creational.builder;

public class SellerComputer {
    private ComputerBuilder computerBuilder;

    public SellerComputer(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer buildComputer() {
        computerBuilder.createComputer();
        computerBuilder.buildCpu();
        computerBuilder.buildHdd();
        computerBuilder.buildPrice();

        Computer computer = computerBuilder.getComputer();
        return computer;
    }
}
