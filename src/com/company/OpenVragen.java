package com.company;


public class OpenVragen extends Vragen {

    private static String aantwoord;

    public String CheckVragen(Vragen vraag){
        if (vraag.getAntwoord().equals(antwoord)){
            return "Goed";
        }
        else {
            return "Fout";
        }
    }

    private static void setAantwoord(String aAntwoord){
        aantwoord = aAntwoord;

    }
}
