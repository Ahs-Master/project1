package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Toets {
    private String vraag;
    private ArrayList<String> keuzes;
    private String aantwoord;


    public Toets(String vraag, String[] keuzes, String aantwoord) {
        this.vraag = vraag;
        this.aantwoord = aantwoord;

        this.keuzes = new ArrayList<>();
        this.keuzes.addAll(Arrays.asList(keuzes));

        Collections.shuffle(this.keuzes);
    }

    public String getVraag (){
        return vraag;
    }
    public String getAantwoord(){
        return aantwoord;
    }
    public ArrayList<String> getKeuzes() {
        return keuzes;
    }
}