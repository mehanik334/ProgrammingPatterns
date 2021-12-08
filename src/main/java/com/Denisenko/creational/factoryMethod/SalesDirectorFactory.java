package com.Denisenko.creational.factoryMethod;

public class SalesDirectorFactory implements DirectorFactory {
    @Override
    public Director createDirector() {
        return new SalesDirector();
    }
}
