package com.company;

import java.util.*;

public class PraktijkExamenToets extends ToetsVragen {

    //<------Instance Variables------->
    private static ArrayList<ToetsVragen> praktijkVragen = new ArrayList<>();

    //<------Constructor------->
    public PraktijkExamenToets(String vraag, String[] keuzes, String aantwoord) {
        super(vraag, keuzes, aantwoord);
    }

    //<------Om de toets te beginnen------->
    public static void ToetsMakken() {

        vragenMaken();


        Scanner scanner = new Scanner(System.in);
        int correcteAantwoorden = 0; // Correcte aantwoorden voor score. de score systeem heb ik nog niet geimplementeerd. Ben moe.

        for (int vraag = 0; vraag < praktijkVragen.size(); vraag++) {   // de vragen uitprinten op scherm.
            System.out.printf("Vraag %d: %s%n", vraag + 1, Vragen.get(vraag));


            int numKeuzes = praktijkVragen.get(vraag).getKeuzes().size();
            for (int keuze = 0; keuze < numKeuzes; keuze++) {
                System.out.println((keuze + 1) + ": " + praktijkVragen.get(vraag).getKeuzes().get(keuze));
            }

            System.out.print("Aantwoord: ");
            int aantwoord = scanner.nextInt();
            System.out.println();


            ArrayList<String> Keuzes = praktijkVragen.get(vraag).getKeuzes();
            String correcteAntwoord = getAantwoord();
            int correcteAntwoordIndex = Keuzes.indexOf(correcteAntwoord);
            if (aantwoord == correcteAntwoordIndex + 1) {
                correcteAantwoorden++;
            }
        }
        scanner.close();
        System.out.printf("je heb : %s van de %s punten gehaald. ", correcteAantwoorden, praktijkVragen.size());
    }

    //<------Om de vragen te makken------->
    public static void vragenMaken() {
        String vraag = "Moet je mensen voor laten gaan als ze willen oversteken bij een zebrapad?"; //Vraag
        String[] keuze = {"ja", "nee"}; //Aantwoorden.
        String aantwoord = "ja";
        PraktijkExamenToets.praktijkVragen.add(new ToetsVragen(vraag, keuze, aantwoord));

        vraag = "Wat is 2 + 2?"; //Vraag
        keuze = new String[]{"15", "600","4"}; //Aantwoorden.
        aantwoord = "4";
        PraktijkExamenToets.praktijkVragen.add(new ToetsVragen(vraag, keuze, aantwoord));

        vraag = "Test Test Tes?"; //Vraag
        keuze = new String[]{"Google", "Dongle","Wongle"}; //Aantwoorden.
        aantwoord = "Wongle";
        PraktijkExamenToets.praktijkVragen.add(new ToetsVragen(vraag, keuze, aantwoord));

        vraag = "Gone with the wind?"; //Vraag
        keuze = new String[]{"Sparks", "Larks"}; //Aantwoorden.
        aantwoord = "Sparks";
        PraktijkExamenToets.praktijkVragen.add(new ToetsVragen(vraag, keuze, aantwoord));

    }

    //<------Om de vragen op de scherm te tonen------->
    public static void displayVragen() {
        vragenMaken();
        for (int i = 0; i < praktijkVragen.size(); i++) {
            System.out.printf("Vraag %d: %s%n", i + 1, praktijkVragen.get(i).getVraag(i));
            System.out.println();
        }


    }

    //<------Om de keuzes op scherm te tonen------->
    public static void displayKeuzes() {
        vragenMaken();
        for (ToetsVragen toetsVragen : praktijkVragen) {
            for (int k = 0; k < toetsVragen.getKeuzes().size(); k++) {
                System.out.printf("%d: %s%n", k + 1, toetsVragen.getKeuzes().get(k));
            }
            System.out.println();

        }
    }

    //<------Om vragen toe te voegen aan de toets------->
    public static void addVraag(String vraag, String [] keuzes, String aantwoord){
        praktijkVragen.add(new PraktijkExamenToets(vraag,keuzes,aantwoord));

    }
}
