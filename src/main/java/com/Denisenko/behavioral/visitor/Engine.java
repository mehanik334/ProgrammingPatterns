package com.Denisenko.behavioral.visitor;

public class Engine implements CarElement {
    @Override
    public void beCollect(Mechanic mechanic) {
        mechanic.create(this);
    }
}
