package com.Denisenko.creational.factoryMethod;

public class CommercialDirectorFactory implements DirectorFactory{
    @Override
    public Director createDirector() {
        return new CommercialDirector();
    }
}
