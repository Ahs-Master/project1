package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MeerkeuzeVragen extends Vragen {
    public static ArrayList<String> keuzes = new ArrayList<>();

    public void meerkeuzevragen (String vraag, String[] keuzes, String antwoord){
        this.vraag = vraag;
        this.antwoord = antwoord;
        this.keuzes = new ArrayList<>()
        ;
        this.keuzes.addAll(Arrays.asList(keuzes));

        Collections.shuffle(this.keuzes);

        Vragen.add(vraag);
    }

    public ArrayList<String> getKeuzes() {
        return keuzes;
    }
}
