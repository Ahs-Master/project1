package com.company;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Student {

    private final String naam;
    private final String achternaam;
    private static Integer studentId = 20130767;
    private static boolean geslaagd;


    private static final ArrayList<Student> studentLijst = new ArrayList<>();
    private static final ArrayList<Student> geslaagdeStudenten = new ArrayList<>();
    private static final ArrayList<Integer> studentenIdLijst = new ArrayList<>();

    //<<----Constructor---->>

    public Student(String naam, String achternaam){

        this.naam = naam;
        this.achternaam =  achternaam;




    }

    //<----Accessors----->

    public static void addStudent(String naam, String achternaam){
        Student.studentLijst.add(new Student(naam,achternaam));

        //Generate a Random Number for Student elke keer dat een nieuwe student aangemaakt wordt.
        for (Integer integer : studentenIdLijst) {
            if (integer.equals(studentId)) {
                studentId = ThreadLocalRandom.current().nextInt(20130767, 20130999);
            }
        }
        studentenIdLijst.add(studentId);
    }
    public static void printStudentLijst() {
        for (int i = 0; i < studentLijst.size(); i++ ) {   // de studenten uitprinten op scherm.

            System.out.printf("Student Naam: %s %s%n",studentLijst.get(i).getNaam(),studentLijst.get(i).getAchternaam());
            System.out.printf("Student Nummer: %d%n%n",studentenIdLijst.get(i));
        }
    }
    public static void setWelGeslaagd(Student student){
        geslaagd = true;
        geslaagdeStudenten.add(student);

    }
    public static void setNietGeslaagd(){
        geslaagd = false;
    }

    //<----Mutators------->
    public String getNaam() {
        return naam;
    }
    public String getAchternaam() {
        return achternaam;
    }
    public Integer getStudentId(){
        return studentId;
    }

}

