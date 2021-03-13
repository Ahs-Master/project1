package com.company;




public class Main {

    public static void main(String[] args) {


        String vraag = "Dit is een custom vraag.";
        String aantwoord = "Rachid";
        String [] keuzes = {"Kevin","Quincy","Jonathan"};
        PraktijkExamenToets extraVraag = new PraktijkExamenToets(vraag,keuzes,aantwoord);

        PraktijkExamenToets.displayVragen();
    }



}
