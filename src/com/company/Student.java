package com.company;

public class Student {
    //Атрибуты
    private String fName, sName, mName;
    private Subject[] subjects;

    //Свойства
    public String getfName(String fName) {
        return fName;
    }
    public void setfName() {
        this.fName = fName;
    }

    public String getsName(String sName) {
        return sName;
    }
    public void setsName() {
        this.sName = sName;
    }

    public String getmName(String mName) {
        return mName;
    }
    public void setmName() {
        this.mName = mName;
    }

    //Конструктор
    public Student(String fName, String sName, String mName, Subject[] subjects) {
        this.fName = fName;
        this.sName = sName;
        this.mName = mName;
        this.subjects = subjects;
    }

    //Метод
    public Subject[] listSubjects(){
        return subjects.clone();
    }
}
