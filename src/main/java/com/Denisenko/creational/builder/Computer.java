package com.Denisenko.creational.builder;

public class Computer {
    private Cpu cpu;
    private Hdd hdd;
    private int price;

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", hdd=" + hdd +
                ", price=" + price +
                '}';
    }
}
