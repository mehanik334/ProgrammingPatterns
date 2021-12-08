package com.Denisenko.creational.builder;

public class HomeComputer extends ComputerBuilder{
    @Override
    public void buildCpu() {
        computer.setCpu(new Cpu("intel i3"));
    }

    @Override
    public void buildHdd() {
        computer.setHdd(new Hdd("WD", 500));
    }

    @Override
    public void buildPrice() {
        computer.setPrice(100);
    }
}
