package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student first = new Student("1","1","1", new Subject[]{
                new Subject("Алгебра", 4),
                new Subject("Химия", 1),
                new Subject("Русский язык", 3),
                new Subject("Литература", 5),
                new Subject("Геометрия", 2),
                new Subject("География", 2),
                new Subject("Биология", 0)
        });

        Student second = new Student("1","1","1", new Subject[]{
                new Subject("Алгебра", 5),
                new Subject("Химия", 5),
                new Subject("Русский язык", 5),
                new Subject("Литература", 5)
        });

        Student third = new Student("1","1","1", new Subject[]{
                new Subject("Алгебра", 2),
                new Subject("Химия", 2),
                new Subject("Русский язык", 0),
                new Subject("Литература", 0)
        });

        System.out.println(countOfSubjectsPassed(first));
        System.out.println(averageRating(first));
        System.out.println(listOfdidNotPass(first));
        System.out.println(listOfSubjectsWithTwo(first));
        System.out.println(didNotPass(first));
        System.out.println(excellentStudent(first));

        System.out.println();
        System.out.println(countOfSubjectsPassed(second));
        System.out.println(averageRating(second));
        System.out.println(listOfdidNotPass(second));
        System.out.println(listOfSubjectsWithTwo(second));
        System.out.println(didNotPass(second));
        System.out.println(excellentStudent(second));

        System.out.println();
        System.out.println(countOfSubjectsPassed(third));
        System.out.println(averageRating(third));
        System.out.println(listOfdidNotPass(third));
        System.out.println(listOfSubjectsWithTwo(third));
        System.out.println(didNotPass(third));
        System.out.println(excellentStudent(third));
    }

    // 1
    public static Integer countOfSubjectsPassed(Student person){

        Integer count = 0;

        Subject[] subjectsPerson = person.listSubjects();
        for (Subject variable : subjectsPerson) {
            Integer mark = variable.getMark();
            if (mark == 4 || mark == 5) {
                count += 1;
            }
        }
        return count;
    }

    // 2
    public static double averageRating(Student person){

        double sum = 0.0;
        Integer count = 0;

        Subject[] subjectsPerson = person.listSubjects();
        for (Subject variable : subjectsPerson) {
            Integer mark = variable.getMark();
            if (variable.isExam(mark)) {
                count += 1;
                sum = sum + mark;
            }
        }
        return sum / count;
    }

    // 3
    public static ArrayList<String> listOfdidNotPass(Student person){

        ArrayList<String> didNotPassSubject = new ArrayList<>();
        Subject[] subjectsPerson = person.listSubjects();
        for (Subject variable : subjectsPerson) {
            if (variable.getMark() == 0) {
                didNotPassSubject.add(variable.getName());
            }
        }
        return didNotPassSubject;
    }

    // 4
    public static ArrayList<String> listOfSubjectsWithTwo(Student person){

        ArrayList<String> didNotPassSubject = new ArrayList<>();
        Subject[] subjectsPerson = person.listSubjects();
        for (Subject variable : subjectsPerson) {
            if (variable.getMark() == 2) {
                didNotPassSubject.add(variable.getName());
            }
        }
        return didNotPassSubject;
    }

    // 5
    public static boolean didNotPass(Student person){

        Subject[] subjectsPerson = person.listSubjects();
        for (Subject variable : subjectsPerson) {
            if (variable.getMark() == 0 || variable.getMark() == 2) {
                return true;
            }
        }
        return false;
    }

    // 6
    public static boolean excellentStudent(Student person){

        Subject[] subjectsPerson = person.listSubjects();
        for (Subject variable : subjectsPerson) {
            if (variable.getMark() != 5 && variable.getMark() != 1) {
                return false;
            }
        }
        return true;
    }
}

enum MarksEnum {

    NotPassed(0), //Не зачет
    Passed(1), //Зачет
    Bad(2),
    Satisfactory(3),
    Good(4),
    Excellent(5);

    private Integer grade;

    MarksEnum(Integer grade) {
        this.grade = grade;
    }

    public Integer getGrade(){
        return grade;
    }
}
