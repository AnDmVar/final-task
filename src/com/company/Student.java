package com.company;

public class Student {
    private String fName, sName, mName;
    private Subject[] subjects;

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

    public Student(String fName, String sName, String mName, Subject[] subjects) {
        this.fName = fName;
        this.sName = sName;
        this.mName = mName;
        this.subjects = subjects;
    }

    public Subject[] listSubjects() {
        Subject[] deepCopyOnSubjectsArray = new Subject[subjects.length];

        Subject subject = null;
        Subject deepCopyOnSubject = null;
        for (int i = 0; i < subjects.length; i++) {
            subject = subjects[i];

            deepCopyOnSubject = new Subject(
                    new String(subject.getName()),
                    subject.getMark()
            );

            deepCopyOnSubjectsArray[i] = deepCopyOnSubject;
        }
        return deepCopyOnSubjectsArray;
    }
}
