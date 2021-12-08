package com.Denisenko.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class StudentOlympiad {
    public static void main(String[] args) {
        StudentFactory studentFactory = new StudentFactory();
        List<Student> students = new ArrayList<>();
        students.add(studentFactory.getStudentByStudyingTime("freshman"));
        students.add(studentFactory.getStudentByStudyingTime("freshman"));
        students.add(studentFactory.getStudentByStudyingTime("freshman"));
        students.add(studentFactory.getStudentByStudyingTime("seniorman"));
        students.add(studentFactory.getStudentByStudyingTime("seniorman"));
        students.add(studentFactory.getStudentByStudyingTime("seniorman"));
        students.add(studentFactory.getStudentByStudyingTime("seniorman"));
        students.add(studentFactory.getStudentByStudyingTime("seniorman"));

        for (Student student:students) {
            student.study();
        }
    }
}
