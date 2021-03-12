package com.company;

import java.util.*;

public class TheorieExamenToets extends ToetsVragen{

    public static ArrayList<ToetsVragen> theorieVragen = new ArrayList<>();




    public TheorieExamenToets(String vraag, String[] keuzes, String aantwoord) {
        super(vraag, keuzes, aantwoord);


        //Vraag 1







        String vraag1 = "Moet je mensen voor laten gaan als ze willen oversteken bij een zebrapad?"; //Vraag
        String[] keuze1 = {"ja", "nee"}; //Aantwoorden.
        String aantwoord1 = "ja";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen (vraag1,keuze1,aantwoord1)); // de vraag en aantwoorden in de array stoppen.

              //Vraag 2
        String vraag2 = "Moet je fietsende mensen door laten gaan bij een zebrapad?" ; //Vraag
        String[] keuze2 = {"ja", "nee"}; //Aantwoorden.
        String aantwoord2 = "nee";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag2,keuze2,aantwoord2)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 3
        String vraag3 = "Moet je een politieauto voorang geven die zwaailichten aan heeft?"; //Vraag
        String[] keuze3 = {"ja","misschien", "nee"}; //Aantwoorden.
        String aantwoord3 = "ja";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag3,keuze3,aantwoord3)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 4
        String vraag4 = "Hoe hard mag je rijden met een aanhangwagen op de snelweg?"; //Vraag
        String[] keuze4 = {"130km/h", "90km/h", "Je mag niet rijden op de snelweg met een aanhangwagen"}; //Aantwoorden.
        String aantwoord4 = "90km/h";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag4,keuze4,aantwoord4)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 5
        String vraag5 = "Mag je rechts inhalen op een uitvoegstrook?"; //Vraag
        String[] keuze5 = {"ja dat mag door de blokmarkering", "Nee dat mag absoluut niet"}; //Aantwoorden.
        String aantwoord5 = "ja dat mag door de blokmarkering";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag5,keuze5,aantwoord5)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 6
        String vraag6 = "Hoe lang moet je zijn om voorin te kunnen zitten?"; //Vraag
        String[] keuze6 = {"145cm", "135cm", "155cm"}; //Aantwoorden.
        String aantwoord6 = "135cm";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag6,keuze6,aantwoord6)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 7
        String vraag7 = "Mag je tijdens het rijden een belangrijke appje lezen?"; //Vraag
        String[] keuze7 = {"ja", "nee"}; //Aantwoorden.
        String aantwoord7 = "nee";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag7,keuze7,aantwoord7)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 8
        String vraag8 = "Beinvloed drugs je rijvaardigheid?"; //Vraag
        String[] keuze8 = {"ja het is verboden om te rijden als je drugs hebt ingenomen.", "nee ligt eraan welke drugs", "nee helemaal niet"}; //Aantwoorden.
        String aantwoord8 = "ja het is verboden om te rijden als je drugs hebt ingenomen";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag8,keuze8,aantwoord8)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 9
        String vraag9 = "wat indiceert een blauw lampje?"; //Vraag
        String[] keuze9 = {"groot licht", "Accu moet vervangen worden", "mistachterlicht"}; //Aantwoorden.
        String aantwoord9 = "groot licht";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag9,keuze9,aantwoord9)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 10
        String vraag10 = "Hoe hard mag je rijden op de snelweg wanneer je geen maximumsnelheid ziet?"; //Vraag
        String[] keuze10 = {"110km/h", "120km/h", "130km/h"}; //Aantwoorden.
        String aantwoord10 = "110km/h";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag10,keuze10,aantwoord10)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 11
        String vraag11 = "Wanneer mag je door rijden als het stoplicht op oranje springt?"; //Vraag
        String[] keuze11 = {"Altijd want hij staat nog niet op rood", "nooit", "alleen als je niet op tijd kan stoppen"}; //Aantwoorden.
        String aantwoord11 = "alleen als je niet op tijd kan stoppen";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag11,keuze11,aantwoord11)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 12
        String vraag12 = "Moet je bij een rood lampje dat knippert in je auto stoppen?"; //Vraag
        String[] keuze12 = {"direct stoppen want rood betekent dat het gevaar kan opleveren", "Doorrijden het lampje gaat weer vanzelf weg", "rit afmaken en later naar de garage gaan"}; //Aantwoorden.
        String aantwoord12 = "direct stoppen want rood betekent dat het gevaar kan opleveren";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag12,keuze12,aantwoord12)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 13
        String vraag13 = "je nadert een normale kruispunt en wilt links afslaan, aan de rechterkant komt er een auto aan, aan de overkant rijdt een tram die rechtdoor gaat, wie mag eerst?"; //Vraag
        String[] keuze13 = {"jijzelf", "de tram", "de auto van rechts"}; //Aantwoorden.
        String aantwoord13 = "de tram";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag13,keuze13,aantwoord13)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 14
        String vraag14 = "wat is de maximum snelheid op de nederlandse snelwegen"; //Vraag
        String[] keuze14 = {"200km/h", "130km/h", "100km/h"}; //Aantwoorden.
        String aantwoord14 = "130km/h";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag14,keuze14,aantwoord14)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 15
        String vraag15 = "mag je inhalen bij een doorgetrokken streep"; //Vraag
        String[] keuze15 = {"ja", "nee", "alleen als het veilig is"}; //Aantwoorden.
        String aantwoord15 = "nee";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag15,keuze15,aantwoord15)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 16
        String vraag16 = "je sleept een personenauto met een personenauto, volgens het rvv is de gesleepte auto een:"; //Vraag
        String[] keuze16 = {"zelfstandige voertuig", "aanhanger"}; //Aantwoorden.
        String aantwoord16 = "aanhanger";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag16,keuze16,aantwoord16)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 17
        String vraag17 = "gemiddeld mag iemand een ervaren chauffeur genoemd worden:"; //Vraag
        String[] keuze17 = {"na 3 jaar of 35000 kilometer", "na 7 jaar of 100000 kilometer"}; //Aantwoorden.
        String aantwoord17 = "na 7 jaar of 100000 kilometer";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag17,keuze17,aantwoord17)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 18
        String vraag18 = "Zit er evenveel alcohol in een standaard glas jenever als in een standaard glas whisky?"; //Vraag
        String[] keuze18 = {"ja", "nee"}; //Aantwoorden.
        String aantwoord18 = "ja";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag18,keuze18,aantwoord18)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 19
        String vraag19 = "Als het dimlicht op de auto niet werkt, mag je:"; //Vraag
        String[] keuze19 = {"niet rijden", "met stadslicht alsnog rijden"}; //Aantwoorden.
        String aantwoord19 = "niet rijden";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag19,keuze19,aantwoord19)); // de vraag en aantwoorden in de array stoppen.

        //Vraag 20
        String vraag20 = "wat betekent rijzicht?"; //Vraag
        String[] keuze20 = {"de afstand waar een bestuurder de weg kan overzien", "de afstand waarover een bestuurder de weg moet kunnen overzien"}; //Aantwoorden.
        String aantwoord20 = "de afstand waarover een bestuurder de weg kan overzien";
        TheorieExamenToets.theorieVragen.add(new ToetsVragen(vraag20,keuze20,aantwoord20)); // de vraag en aantwoorden in de array stoppen.




       Collections.shuffle(TheorieExamenToets.theorieVragen, new Random()); //vragen in random elke keer dat de test gemaakt wordt.


    }

        public static void ToetsMakken(){  // om de ToetsVragen te beginnen

            Scanner scanner = new Scanner(System.in);
            int correcteAantwoorden = 0; // Correcte aantwoorden voor score. de score systeem heb ik nog niet geimplementeerd. Ben moe.

            for (int vraag = 0; vraag < TheorieExamenToets.theorieVragen.size(); vraag++) {   // de vragen uitprinten op scherm.
                System.out.println();

                //om te checken hoeveel keuzes je heb en keuzes op de scherm uitprinten
                int numKeuzes = TheorieExamenToets.theorieVragen.get(vraag).getKeuzes().size();
                for (int keuze = 0; keuze < numKeuzes; keuze++) {
                    System.out.println((keuze + 1) + ": " + TheorieExamenToets.theorieVragen.get(vraag).getKeuzes().get(keuze));
                }

                // aantwoord geven op de vraag met 1 tot en met de (3)keuzes.
                // desnoods ook om te checken of de je een correcte aantwoord heb gekregen bij de vraag.
                System.out.print("Aantwoord: ");
                int aantwoord = scanner.nextInt();
                System.out.println();
                ArrayList<String> Keuzes = TheorieExamenToets.theorieVragen.get(vraag).getKeuzes();
                String correcteAntwoord = getAantwoord();
                int correcteAntwoordIndex = Keuzes.indexOf(correcteAntwoord);
                if (aantwoord == correcteAntwoordIndex + 1) {
                    correcteAantwoorden++;
                }
            }
            scanner.close();




             System.out.printf("je heb : %s van de %s punten gehaald. ",correcteAantwoorden,TheorieExamenToets.theorieVragen.size());
            }


        //om de vragen op de scherm te tonen.
        public static void displayTheorieVragen(){
            for (int i = 0; i < TheorieExamenToets.theorieVragen.size(); i++){
                System.out.println(TheorieExamenToets.theorieVragen.get(i));
                System.out.println();
            }
    }
}
