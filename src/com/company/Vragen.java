package com.company;

import java.util.ArrayList;

public class Vragen {
    public static String vraag;
    public static String antwoord;

    public static ArrayList <String> Vragen = new ArrayList<>();

    public void Toetsvragen (String vraag, String antwoord){
        this.vraag = vraag;
        this.antwoord = antwoord;
    }
    public String getVraag(){ return this.vraag; }
    public String getAntwoord(){ return this.antwoord; }
    public static void vragenUitprinten(){
        System.out.println(Vragen);
    }
}
