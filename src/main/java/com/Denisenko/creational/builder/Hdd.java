package com.Denisenko.creational.builder;

public class Hdd {
    private String name;
    private int capasity;

    public Hdd(String name, int capasity) {
        this.name = name;
        this.capasity = capasity;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "name='" + name + '\'' +
                ", capasity=" + capasity +
                '}';
    }
}
