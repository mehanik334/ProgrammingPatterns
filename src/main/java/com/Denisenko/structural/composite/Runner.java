package com.Denisenko.structural.composite;

public class Runner {
    public static void main(String[] args) {
        RaceTEam raceTeam = new RaceTEam();
        Ingeneer firstMechanicIngeneer = new Mechanic();
        Ingeneer secondMechanicIngeneer = new Mechanic();
        Ingeneer designerIngeneer = new Designer();

        raceTeam.addIngener(firstMechanicIngeneer);
        raceTeam.addIngener(secondMechanicIngeneer);
        raceTeam.addIngener(designerIngeneer);

        raceTeam.createRaceCar();
    }
}
