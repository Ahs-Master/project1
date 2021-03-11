package com.company;

import java.util.*;

public class TheorieExamenVragen {
    private static ArrayList<Toetsen> theorieExamenVragens = new ArrayList<>();


    public TheorieExamenVragen() {


        //Vraag 1

        String vraag1 = "Moet je mensen voor laten gaan als ze willen oversteken bij een zebrapad? ja of nee?"; //Vraag
        String[] keuze1 = {"ja", "nee"}; //Aantwoorden.
        String aantwoord1 = "ja";
        theorieExamenVragens.add(new TheorieExamenClass(vraag1,keuze1,aantwoord1)); // de vraag en aantwoorden in de array stoppen.

              //Vraag 2
        String vraag2 = "Wat is jou naam?"; //Vraag
        String[] keuze2 = {"Kevin", "Johnny", "Rachid"}; //Aantwoorden.
        String aantwoord2 = "Rachid";
        theorieExamenVragens.add(new Toetsen(vraag2,keuze2,aantwoord2)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 3
        String vraag3 = "Wat is jou naam?"; //Vraag
        String[] keuze3 = {"Kevin", "Johnny", "Rachid"}; //Aantwoorden.
        String aantwoord3 = "Rachid";
        theorieExamenVragens.add(new TheorieExamenClass(vraag2,keuze2,aantwoord2)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 4
        String vraag4 = "Wat is jou naam?"; //Vraag
        String[] keuze4 = {"Kevin", "Johnny", "Rachid"}; //Aantwoorden.
        String aantwoord4 = "Rachid";
        theorieExamenVragens.add(new TheorieExamenClass(vraag2,keuze2,aantwoord2)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 5
        String vraag5 = "Wat is jou naam?"; //Vraag
        String[] keuze5 = {"Kevin", "Johnny", "Rachid"}; //Aantwoorden.
        String aantwoord5 = "Rachid";
        theorieExamenVragens.add(new TheorieExamenClass(vraag2,keuze2,aantwoord2)); // de vraag en aantwoorden in de array stoppen.




       Collections.shuffle(theorieExamenVragens, new Random()); //vragen in random elke keer dat de test gemaakt wordt.


    }

        public static void ToetsenMakken(){  // om de Toetsen te beginnen
            Scanner scanner = new Scanner(System.in);
            int correcteAantwoorden = 0; // Correcte aantwoorden voor score. de score systeem heb ik nog niet geimplementeerd. Ben moe.

            for (Toetsen theorieExamenVragen : theorieExamenVragens) {   // de vragen uitprinten op scherm.
                System.out.println(theorieExamenVragen.getVraag());

                //om te checken hoeveel keuzes je heb en keuzes op de scherm uitprinten
                int numKeuzes = theorieExamenVragen.getKeuzes().size();
                for (int keuze = 0; keuze < numKeuzes; keuze++) {
                    System.out.println((keuze + 1) + ": " + theorieExamenVragen.getKeuzes().get(keuze));
                }

                // aantwoord geven op de vraag met 1 tot en met de (3)keuzes.
                // desnoods ook om te checken of de je een correcte aantwoord heb gekregen bij de vraag.
                System.out.print("Aantwoord: ");
                int aantwoord = scanner.nextInt();
                System.out.println();
                ArrayList<String> Keuzes = theorieExamenVragen.getKeuzes();
                String correcteAntwoord = theorieExamenVragen.getAantwoord();
                int correcteAntwoordIndex = Keuzes.indexOf(correcteAntwoord);
                if (aantwoord == correcteAntwoordIndex + 1) {
                    correcteAantwoorden++;
                }
            }
            scanner.close();




             System.out.printf("je heb : %s van de %s punten gehaald. ",correcteAantwoorden,theorieExamenVragens.size());
            }


        //om de vragen op de scherm te tonen.
    public static void displayVragen() {
        for (Toetsen theorieExamenVragen : theorieExamenVragens) {
            System.out.println(theorieExamenVragen.getVraag());

        }
    }
    public static void displayCOunter(){
        System.out.println(theorieExamenVragens.size());
    }


}
// 1: Kevin
// 2: Johnny
