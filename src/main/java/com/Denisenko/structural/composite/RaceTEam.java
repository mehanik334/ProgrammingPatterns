package com.Denisenko.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class RaceTEam {
    private List<Ingeneer> ingeners = new ArrayList<Ingeneer>();

    public void addIngener(Ingeneer ingeneer) {
        ingeners.add(ingeneer);
    }

    public void removeIngener(Ingeneer ingeneer) {
        ingeners.remove(ingeneer);
    }

    public void createRaceCar() {
        System.out.println("Race team create race car");
        for (Ingeneer ingeneer: ingeners) {
            ingeneer.work();
        }
    }
}
