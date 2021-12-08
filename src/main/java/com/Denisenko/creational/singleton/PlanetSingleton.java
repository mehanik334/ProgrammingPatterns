package com.Denisenko.creational.singleton;

public class PlanetSingleton {
    private static PlanetSingleton planetSingleton;
    private String name;

    private PlanetSingleton() {};

    public static PlanetSingleton getInstance() {
        if(planetSingleton == null) {
            planetSingleton = new PlanetSingleton();
        }
        return planetSingleton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PlanetSingleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
