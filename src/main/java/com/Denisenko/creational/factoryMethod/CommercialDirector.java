package com.Denisenko.creational.factoryMethod;

public class CommercialDirector implements Director {
    @Override
    public void manage() {
        System.out.println("Commercial Director manages purchases and sales");
    }
}
