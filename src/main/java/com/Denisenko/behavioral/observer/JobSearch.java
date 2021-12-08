package com.Denisenko.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();
        jobSite.addVacancy("JuniorJavaDeveloper");
        jobSite.addVacancy("MiddleJavaDeveloper");

        Observer firstSubscriber = new Subscriber("Sasha Denisenko");
        Observer secondSubscriber = new Subscriber("Alena Denisenko");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("C++ Developer");
    }
}
