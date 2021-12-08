package com.Denisenko.creational.prototype;

public class Teacher {
    public static final String TEXT_HW1 = "Given an integer array nums, " +
            "find the contiguous subarray (containing at least one number) " +
            "which has the largest sum and return its sum.";

    public static void main(String[] args) {
        HomeWork homeWork1 = new HomeWork(1,"HW1",TEXT_HW1);
        System.out.println(homeWork1);
        HomeWorkFactory factory = new HomeWorkFactory(homeWork1);
        HomeWork cloneHomeWork1 = factory.cloneHomeWork();
        System.out.println("==============================");
        System.out.println(cloneHomeWork1);
    }
}
