package com.company;

public class Subject {
    private String name;
    private int mark;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Integer getMark() {
        return mark;
    }
    public void setMark(MarksEnum marksEnum) {
        this.mark = marksEnum.getGrade();
    }

    public Subject(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public Subject(String name) {
        this(name, MarksEnum.NotPassed.getGrade());
    }

    public boolean isExam() {
        return !(this.mark == MarksEnum.Passed.getGrade() ||
                this.mark == MarksEnum.NotPassed.getGrade());
    }
}
