package com.Denisenko.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class StudentFactory {

    private static final Map<String,Student> students = new HashMap<String, Student>();

    public Student getStudentByStudyingTime(String studyingTime) {
        Student student = students.get(studyingTime);

        if(student == null) {
            switch (studyingTime) {
                case "freshman":
                    System.out.println("Freshman is go to student olympiad");
                    student = new FreshmanStudent();
                    break;
                case "seniorman":
                    System.out.println("Seniorman is go to student olympiad");
                    student = new SeniormanStudent();
                    break;
            }
            students.put(studyingTime,student);
        }
        return student;
    }
}
