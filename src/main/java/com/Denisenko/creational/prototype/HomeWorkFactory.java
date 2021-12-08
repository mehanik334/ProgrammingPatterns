package com.Denisenko.creational.prototype;

public class HomeWorkFactory {
    private HomeWork homeWork;

    public HomeWorkFactory(HomeWork homeWork) {
        this.homeWork = homeWork;
    }

    public void setHomeWork(HomeWork homeWork) {
        this.homeWork = homeWork;
    }

    public HomeWork cloneHomeWork() {
        return (HomeWork) homeWork.copy();
    }
}
