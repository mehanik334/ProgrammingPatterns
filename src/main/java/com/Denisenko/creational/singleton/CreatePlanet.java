package com.Denisenko.creational.singleton;

public class CreatePlanet {
    public static void main(String[] args) {
        PlanetSingleton earth= PlanetSingleton.getInstance();
        earth.setName("Earth");

        System.out.println(earth);
    }
}
