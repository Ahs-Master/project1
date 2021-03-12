package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ToetsVragen {


    private static String vraag;
    private static String aantwoord;
    private static Integer aantalStudentenGeslaagd;

    private ArrayList<String> keuzes = new ArrayList<>();



    public ToetsVragen(String vraag, String[] keuzes, String aantwoord) {
        this.vraag = vraag;
        this.aantwoord = aantwoord;

        this.keuzes = new ArrayList<>();
        this.keuzes.addAll(Arrays.asList(keuzes));

        Collections.shuffle(this.keuzes);
    }



    public static void setStudentIsGeslaagd(Student student){
        aantalStudentenGeslaagd++;
        Student.setWelGeslaagd(student);
    }
    public static void addVraag(String vraag){

    }

    public ArrayList<String> getKeuzes() {
        return keuzes;
    }
    public static String  getAantwoord(){
        return aantwoord;
    }
    public String getVraag(){
        return vraag;
    }
}