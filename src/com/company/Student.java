package com.company;

public class Student {
    private String naam;
    private Integer studentId;
    public static Integer StudentIdVorige = 0;

    public Student(String naam){
        this.studentId = StudentIdVorige + 1;
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }
    public Integer getStudentId(){
        return studentId;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}

