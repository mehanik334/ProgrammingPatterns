package com.Denisenko.behavioral.template;

public abstract class RoomTemplate {

    public void showRoom() {
        System.out.println("Big lustre");
        showRoomFeatures();
        System.out.println("room in blue tones");
    }

    public abstract void showRoomFeatures();
}
