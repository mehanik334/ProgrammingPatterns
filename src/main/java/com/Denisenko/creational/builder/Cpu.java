package com.Denisenko.creational.builder;

public class Cpu {
    private String name;

    public Cpu(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "name='" + name + '\'' +
                '}';
    }
}
