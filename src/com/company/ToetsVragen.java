package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ToetsVragen {

    //<--------Instance Variables (Public omdat ze Inherited moeten worden door andere classen)------->
    public static String vraag;
    public static String aantwoord;
    public Integer aantalStudentenGeslaagd;


    //<-------Meerkeuze lijst------->
    public ArrayList<String> keuzes;

    //<-------Vragenlijst------->
    public static ArrayList<String> Vragen = new ArrayList<>();

    //<--------Constructor voor Toetsen------->
    public ToetsVragen(String vraag, String[] keuzes, String aantWoord) {

        vraag = vraag;
        aantwoord = aantWoord;


        //<--------keuzes adden aan de Meerkeuzelijst------->
        this.keuzes = new ArrayList<>();
        this.keuzes.addAll(Arrays.asList(keuzes));

        //<-------Elke keer wordt de Meerkeuzevragen op een andere positie weergegeven------->
        Collections.shuffle(this.keuzes);

        //<-------vragen toevoegen aan de Vragenlijst-------->
        Vragen.add(vraag);
    }

    //<--------Accessors-------->
    public String getVraag(Integer index){
        return Vragen.get(index);
    }
    public static String getAantwoord(){
        return aantwoord;
    }
    public ArrayList<String> getKeuzes() {
        return keuzes;
    }

    //<---------Mutators-------->
    public void setStudentIsGeslaagd(Student student){
        aantalStudentenGeslaagd++;
        Student.setWelGeslaagd(student);
    }
}