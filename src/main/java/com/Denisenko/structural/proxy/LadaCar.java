package com.Denisenko.structural.proxy;

public class LadaCar implements Car {

    private int price;

    public LadaCar(int price) {
        this.price = price;
        byu();
    }

    public void byu(){
        System.out.println("Byu lada car for " + price);
    }

    @Override
    public void drive() {
        System.out.println("Drive bought lada car for " + price);
    }
}
