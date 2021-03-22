package com.company;


public class OpenVragen extends Vragen {

    public String CheckVragen(){
        if (antwoord.equals(antwoord1)){
            return "Goed";
        }
        else {
            return "Fout";
        }
    }
}
