package com.Denisenko.creational.abstractFactory;

public class BuilderSkyscraper implements Builder{
    @Override
    public void build() {
        System.out.println("Building skyscraper...");
    }
}
