package com.company;

public class MeerkeuzeVragen extends Vragen {
    public static String [] keuzes = new String[];

    public meerkeuzevragen (String vraag, String[] keuzes, String antwoord){
        this.vraag = vraag;
        this.keuzes = keuzes;
        this.antwoord = antwoord;
    }

    public String[] getKeuzes() {
        return keuzes;
    }
}
