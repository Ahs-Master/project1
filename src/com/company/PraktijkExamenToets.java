package com.company;

import java.util.*;

public class PraktijkExamenToets extends ToetsVragen {

    public static ArrayList<ToetsVragen> praktijkVragen = new ArrayList<>();

    public PraktijkExamenToets(String vraag, String[] keuzes, String aantwoord) {
        super(vraag, keuzes, aantwoord);
    }

    public static void ToetsMakken(){

        PraktijkExamenToets.VragenMaken();


        Scanner scanner = new Scanner(System.in);
        int correcteAantwoorden = 0; // Correcte aantwoorden voor score. de score systeem heb ik nog niet geimplementeerd. Ben moe.

        for (int vraag = 0; vraag < praktijkVragen.size(); vraag++) {   // de vragen uitprinten op scherm.
            System.out.println(Vragen.get(vraag));


            int numKeuzes = praktijkVragen.get(vraag).getKeuzes().size();
            for (int keuze = 0; keuze < numKeuzes; keuze++) {
                System.out.println((keuze + 1) + ": " + praktijkVragen.get(vraag).getKeuzes().get(keuze));
            }

            System.out.print("Aantwoord: ");
            int aantwoord = scanner.nextInt();
            System.out.println();


            ArrayList <String> Keuzes = praktijkVragen.get(vraag).getKeuzes();
            String correcteAntwoord = getAantwoord();
            int correcteAntwoordIndex = Keuzes.indexOf(correcteAntwoord);
            if (aantwoord == correcteAntwoordIndex + 1) {
                correcteAantwoorden++;
            }
        }
        scanner.close();
        System.out.printf("je heb : %s van de %s punten gehaald. ",correcteAantwoorden,praktijkVragen.size());
    }

    public static void VragenMaken(){
        String vraag = "Moet je mensen voor laten gaan als ze willen oversteken bij een zebrapad?"; //Vraag
        String[] keuze = {"ja", "nee"}; //Aantwoorden.
        String aantwoord = "ja";
        PraktijkExamenToets.praktijkVragen.add(new ToetsVragen (vraag,keuze,aantwoord));

        vraag = "Wat is 2 + 2?"; //Vraag
        keuze = new String[]{"ja", "nee"}; //Aantwoorden.
        aantwoord = "ja";
        PraktijkExamenToets.praktijkVragen.add(new ToetsVragen (vraag,keuze,aantwoord));

        vraag = "Test Test Tes?"; //Vraag
        keuze = new String[]{"ja", "nee"}; //Aantwoorden.
        aantwoord = "ja";
        PraktijkExamenToets.praktijkVragen.add(new ToetsVragen (vraag,keuze,aantwoord));

        vraag = "Gone with the wind?"; //Vraag
        keuze = new String[]{"ja", "nee"}; //Aantwoorden.
        aantwoord = "ja";
        PraktijkExamenToets.praktijkVragen.add(new ToetsVragen (vraag,keuze,aantwoord));



    }

    //Testing Methods
    public static void check(){
         System.out.println(PraktijkExamenToets.praktijkVragen.get(1).getKeuzes().size());
    }

    //om de vragen op de scherm te tonen.
    public static void displayVragen(){
        System.out.println(praktijkVragen.size());


    }
}