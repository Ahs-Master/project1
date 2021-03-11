package com.company;

import java.util.*;

public class TheorieExamenVragen {
    private static ArrayList<TheorieExamenClass> theorieExamenVragens;

    public TheorieExamenVragen() {

        theorieExamenVragens = new ArrayList<>();


        String vraag1 = "Wat is ou naam?";
        String[] aantwoord1 = {"Kevin", "Johnny", "Rachid"};
        theorieExamenVragens.add(new TheorieExamenClass(vraag1, aantwoord1, "Rachid"));

        String vraag2 = "Wat is jou adress?";
        String[] aantwoord2 = {"Souax", "Jan-Thiel", "Mahuma"};
        theorieExamenVragens.add(new TheorieExamenClass(vraag2, aantwoord2, "Mahuma"));

        Collections.shuffle(theorieExamenVragens, new Random());


    }

        public void toetsMakken(){
            Scanner scanner = new Scanner(System.in);
            int correcteAantwoorden = 0;

            for (int vraag = 0; vraag < theorieExamenVragens.size(); vraag++) {
                System.out.println(theorieExamenVragens.get(vraag).getVraag());
                //hoeveel keuzes heb je?
                int numKeuzes = theorieExamenVragens.get(vraag).getKeuzes().size();
                // keuzes uitprinten op de scherm
                for (int keuze = 0; keuze < numKeuzes; keuze++) {
                    System.out.println((keuze + 1) + ": " + theorieExamenVragens.get(vraag).getKeuzes().get(keuze));
                }
                int aantwoord = scanner.nextInt();
                ArrayList<String> Keuzes = theorieExamenVragens.get(vraag).getKeuzes();
                String correcteAntwoord = theorieExamenVragens.get(vraag).getAantwoord();
                int correcteAntwoordIndex = Keuzes.indexOf(correcteAntwoord);
                if (aantwoord == correcteAntwoordIndex + 1) {
                    correcteAantwoorden++;
                }
            }
            scanner.close();

    }

    public void DisplayVragen() {
        for (TheorieExamenClass theorieExamenVragen : theorieExamenVragens) {
            System.out.println(theorieExamenVragen.getVraag());

        }
    }

}

