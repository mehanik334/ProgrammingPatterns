package com.Denisenko.structural.facade;

public class Student {

    public void learnKnowledgeBeforeExam(Tracker tracker) {
        if(tracker.isActiveBusyTime()) {
            System.out.println("Student is study");
        }else {
            System.out.println("Student rest");
        }
    }
}
