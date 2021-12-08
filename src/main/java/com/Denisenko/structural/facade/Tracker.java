package com.Denisenko.structural.facade;

public class Tracker {
    private boolean activeBusyTime;

    public boolean isActiveBusyTime() {
        return activeBusyTime;
    }

    public void startBusyTime() {
        System.out.println("Start time for learning");
        activeBusyTime = true;
    }

    public void finishBusyTime() {
        System.out.println("Finish time for learning");
        activeBusyTime = false;
    }

}
