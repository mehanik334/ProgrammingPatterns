package com.Denisenko.structural.proxy;

public class ProxyCar implements Car {

    private int price;
    private LadaCar ladaCar;

    public ProxyCar(int price) {
        this.price = price;
    }

    @Override
    public void drive() {
        if(ladaCar == null) {
            ladaCar = new LadaCar(price);
        }
        ladaCar.drive();
    }
}
