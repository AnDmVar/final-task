package com.company;

public class Subject {
    //Атрибуты
    private String name;
    private int mark;

    //Cвойства
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

//    public Integer getMark(MarksEnum marksEnum) {
//        return marksEnum.getGrade();
//    }
//    public MarksEnum setMark(int mark) {
//        return MarksEnum(mark);
//    }
//    public void setMark(int mark) {
//        this.mark = mark;
//    }

    public Integer getMark() {
        return mark;
    }
    public void setMark(MarksEnum marksEnum) {
        this.mark = marksEnum.getGrade();
    }

    //Общедоступные конструкторы
    public Subject(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public Subject(String name) {
        this(name, MarksEnum.NotPassed.getGrade());
    }

    //Методы
    public static boolean isExam(int mark) {
        if (mark == 0 || mark == 1) {
            return false;
        } else return true;
    }
}
