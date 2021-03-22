package com.company;

import java.util.ArrayList;

public class MeerkeuzeVragen extends Vragen {
    public static ArrayList <String> keuzes = new ArrayList<>();

    public void meerkeuzevragen (String vraag, String[] keuzes, String antwoord){
        this.vraag = vraag;
        this.antwoord = antwoord;
        this.keuzes = new ArrayList<>();

        Vragen.add(vraag);
    }

    public String[] getKeuzes() {
        return keuzes;
    }
}
