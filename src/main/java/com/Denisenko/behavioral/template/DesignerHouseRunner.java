package com.Denisenko.behavioral.template;

public class DesignerHouseRunner {
    public static void main(String[] args) {
        RoomTemplate hallRoom = new HallRoom();
        RoomTemplate bedRoom = new BedRoom();

        hallRoom.showRoom();
        System.out.println("-------------------");
        bedRoom.showRoom();
    }
}
