package com.Denisenko.behavioral.memento;

public class SaveModificationCarRunner {

    public static void main(String[] args) {
        Modification modification = new Modification();
        Car car = new Car();
        System.out.println("Create new modification for car. Version 1.0");
        modification.setVersionAndDate("Version 1.0");
        System.out.println(modification);
        System.out.println("Build car modification");
        car.setSaveState(modification.save());

        System.out.println("Update modification to version 1.1");
        modification.setVersionAndDate("Version 1.1");
        System.out.println(modification);
        System.out.println("Something are broken");
        System.out.println("Back to Version 1.0");
        modification.load(car.getSaveState());

        System.out.println("Modification car after back version");
        System.out.println(modification);
    }
}
