package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TheorieExamenClass{



    //instance variables voor een examentoets.
    private String vraag;
    private ArrayList<String> keuzes;  // Keuzes is een Array van String(Keuzes).
    private String aantwoord;


    //Contstructor voor de Theorieexamentoets kan ook voor Praktijk. (Copy Paste).
    public TheorieExamenClass (String vraag, String[] keuzes, String aantwoord){
        this.vraag = vraag;
        this.aantwoord = aantwoord;

        this.keuzes = new ArrayList<>();
        this.keuzes.addAll(Arrays.asList(keuzes)); // add alles wat in de lijst staat.




        // Random keuzes elke keer de toets gemaakt wordt volgorde elke keer.
        Collections.shuffle(this.keuzes);

    }
    //accessors (de Getters)
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
