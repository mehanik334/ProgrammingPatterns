package com.Denisenko.creational.prototype;

public class HomeWork implements Copyble{
    private int number;
    private String name;
    private String taskCondition;

    public HomeWork(int number, String name, String taskCondition) {
        this.number = number;
        this.name = name;
        this.taskCondition = taskCondition;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaskCondition() {
        return taskCondition;
    }

    public void setTaskCondition(String taskCondition) {
        this.taskCondition = taskCondition;
    }


    public Object copy() {
        HomeWork copy = new HomeWork(number,name,taskCondition);
        return copy;
    }

    @Override
    public String toString() {
        return "HomeWork{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", taskCondition='" + taskCondition + '\'' +
                '}';
    }
}
