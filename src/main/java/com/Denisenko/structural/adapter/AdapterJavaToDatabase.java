package com.Denisenko.structural.adapter;

public class AdapterJavaToDatabase extends JavaApp implements Database{
    public void insert() {
        saveObject();
    }

    public void update() {
        updateObject();
    }

    public void select() {
        loadObject();
    }

    public void remove() {
        deleteObject();
    }
}
