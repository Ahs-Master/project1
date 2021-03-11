package com.company;

import java.util.ArrayList;

public class Student {
    private String naam;
    private Integer studentId;
    public static Integer StudentIdVorige = 0;
    private static ArrayList<Student> studentList = new ArrayList<>();

    public Student(String naam){

        this.studentId = StudentIdVorige + 1;
        this.naam = naam;


        studentId++;

    }

    public static void addStudent(Student student){
        studentList.add(student);
    }

    public static void printLijst() {
        for (int i = 0; i < studentList.size(); i++) {   // de vragen uitprinten op scherm.
            System.out.println(studentList.get(i));
        }
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
//Student class is best well eenvoudig.
