package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class TheorieExamenClass {
    private String vraag;
    private ArrayList<String> keuzes;
    private String aantwoord;

    public TheorieExamenClass (String vraag, String[] keuzes, String aantwoord){
        this.vraag = vraag;
        this.aantwoord = aantwoord;

        this.keuzes = new ArrayList<String>();
        for (int i = 0; i < keuzes.length; i++){
            this.keuzes.add(keuzes[i]);
        }
        //make sure each game shows questions in different order.
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
