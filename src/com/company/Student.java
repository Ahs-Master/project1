package com.company;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Student extends Gebruiker {

   // <------Instance Variables------->
    private static Integer studentId = 20130767; // StudentID moet ergens beginnen.
    private static boolean isGeslaagd = false;
    private static final ArrayList<Student> studentenLijst = new ArrayList<>();
    private static final ArrayList<Integer> studentenIdLijst = new ArrayList<>();
    private static final ArrayList<Student> geslaagdeStudenten = new ArrayList<>();

    //<<----Constructor---->>
    public Student(String naam, String achternaam) {
        super(naam, achternaam);


        for (Integer K : studentenIdLijst) {
            if (K.equals(studentId)) {
                studentId = ThreadLocalRandom.current().nextInt(20130767, 20130999);
            }
        }
        studentenIdLijst.add(studentId);
        studentenLijst.add(this);
    }


    public static void printStudentLijst() {
        for (int i = 0; i < studentenLijst.size(); i++ ) {   // de studenten uitprinten op scherm.

            System.out.printf("Student Naam: %s%n",studentenLijst.get(i).getFullNaam());
            System.out.printf("Student Nummer: %d%n%n",studentenIdLijst.get(i));
        }
    }

    //<----Mutators------->
    public static void setWelGeslaagd(Student student){
        isGeslaagd = true;
        geslaagdeStudenten.add(student);

    }



}





