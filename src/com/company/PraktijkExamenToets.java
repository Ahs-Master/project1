package com.company;

import java.util.*;

public class PraktijkExamenToets extends ToetsVragen {

    public static ArrayList<ToetsVragen> praktijikVragen = new ArrayList<>();





    public PraktijkExamenToets(String vraag, String[] keuzes, String aantwoord) {
        super(vraag, keuzes, aantwoord);

        String vraag1 = "Wat moet je doen als je iemand ziet lopen op de Zebrapad?"; //Vraag
        String[] keuze1 = {"Doorrijen", "Doodtrappen", "Stoppen"}; //Aantwoorden.
        String aantwoord1 = "Stoppen";
        PraktijkExamenToets.praktijikVragen.add(new ToetsVragen(vraag1,keuze1,aantwoord1)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 2
        String vraag2 = "Wat is jou naam?"; //Vraag
        String[] keuze2 = {"Kevin", "Johnny", "Rachid"}; //Aantwoorden.
        String aantwoord2 = "Rachid";
        PraktijkExamenToets.praktijikVragen.add(new ToetsVragen(vraag2,keuze2,aantwoord2)); // de vraag en aantwoorden in de array stoppen.


        Collections.shuffle(PraktijkExamenToets.praktijikVragen, new Random()); //vragen in random elke keer dat de test gemaakt wordt.

    }

    public static void ToetsMakken(){  // om de Toets te beginnen
        Scanner scanner = new Scanner(System.in);
        int correcteAantwoorden = 0; // Correcte aantwoorden voor score. de score systeem heb ik nog niet geimplementeerd. Ben moe.

        for (int vraag = 0; vraag < PraktijkExamenToets.praktijikVragen.size(); vraag++) {   // de vragen uitprinten op scherm.
            System.out.println(PraktijkExamenToets.praktijikVragen.get(vraag).getVraag());

            //om te checken hoeveel keuzes je heb en keuzes op de scherm uitprinten
            int numKeuzes = PraktijkExamenToets.praktijikVragen.get(vraag).getKeuzes().size();
            for (int keuze = 0; keuze < numKeuzes; keuze++) {
                System.out.println((keuze + 1) + ": " + PraktijkExamenToets.praktijikVragen.get(vraag).getKeuzes().get(keuze));
            }

            // aantwoord geven op de vraag met 1 tot en met de (3)keuzes.
            // desnoods ook om te checken of de je een correcte aantwoord heb gekregen bij de vraag.
            System.out.print("Aantwoord: ");
            int aantwoord = scanner.nextInt();
            System.out.println();
            ArrayList<String> Keuzes = PraktijkExamenToets.praktijikVragen.get(vraag).getKeuzes();
            String correcteAntwoord = getAantwoord();
            int correcteAntwoordIndex = Keuzes.indexOf(correcteAntwoord);
            if (aantwoord == correcteAntwoordIndex + 1) {
                correcteAantwoorden++;
            }
        }
        scanner.close();




        System.out.printf("je heb : %s van de %s punten gehaald. ",correcteAantwoorden,PraktijkExamenToets.praktijikVragen.size());
    }





    //om de vragen op de scherm te tonen.
    public static void displayPraktijkVragen(){
        for (int i = 0; i < PraktijkExamenToets.praktijikVragen.size(); i++){
            System.out.println(PraktijkExamenToets.praktijikVragen.get(i).getVraag());
            System.out.println();
        }
    }
}