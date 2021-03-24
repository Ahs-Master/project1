package com.company;

import java.util.Scanner;

public class Main {

    public static String naam;



    public static void main(String[] args) {

        voerJeNaamIn();
    }
    public static void voerJeNaamIn () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom ");
        System.out.println();
        System.out.printf("Voer uw naam in: ");
        naam = scanner.next();
        System.out.println();
        //System.out.println("Hallo " + naam);
        beginScherm();
    }





    public static void beginScherm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Hallo " + naam);
        System.out.println();
        System.out.println("Menu: ");
        System.out.println();
        System.out.println("1) Lijst met examens");
        System.out.println();
        System.out.println("2) Lijst met studenten");
        System.out.println();
        System.out.println("3) Nieuwe student inschrijven");
        System.out.println();
        System.out.println("4) Examen afnemen");
        System.out.println();
        System.out.println("5) Welke examens heeft student gehaald?");
        System.out.println();
        System.out.println("6) Welke student heeft de meeste examens gehaald?");
        System.out.println();
        System.out.println("0) Afsluiten");
        System.out.println();
        System.out.printf("Uw keuze: ");

        int keuze;

            if (scanner.hasNextInt() == true) {
                keuze = scanner.nextInt();
                scanner.nextLine();
                if (keuze == 1) {
                    examenLijst();
                } else if (keuze == 2) {
                    studentenLijst();
                } else if (keuze == 3) {
                    studentInschrijven();
                } else if (keuze == 4) {
                    examenAfnemen();
                } else if (keuze == 5) {
                    //welke examens heeft student gehaald
                } else if (keuze == 6) {
                    //welke student heeft meeste examens gehaald
                } else if (keuze == 0) {
                    afsluiten();
                } else if (keuze != 1 || keuze != 2 || keuze != 3 || keuze != 4 || keuze != 5 || keuze != 6 || keuze != 7 || keuze != 0) {
                    System.out.printf("Kies aub een menu... Druk op Enter om verder te gaan");
                    scanner.nextLine();
                    beginScherm();
                }
            } else {
                System.out.printf("Voer een getal in! Probeer het opnieuw. Druk Enter");
                scanner.nextLine();
                scanner.nextLine();
                beginScherm();
            }

    }

    public static void examenLijst () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lijst van examens");
        System.out.println();
        System.out.println("-Theorie Examen");
        System.out.println();
        System.out.println("-Praktijk Examen");
        System.out.println();
        System.out.printf("1) Terug naar hoofdmenu");

        int keuze;

        if (scanner.hasNextInt() == true) {
            keuze = scanner.nextInt();
            scanner.nextLine();
            if (keuze == 1) {
                beginScherm();
            } else {
                System.out.println("Kies aub een menu. Druk op Enter om verder te gaan.");
                scanner.nextLine();
                scanner.nextLine();
                examenLijst();
            }

        } else {
            System.out.println("Kies aub een getal. Druk op Enter om verder te gaan.");
            scanner.nextLine();
            scanner.nextLine();
            examenLijst();
        }

    }

    public static void studentenLijst () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lijst van studenten");
        System.out.println();
        System.out.println("Kevin van Hoogendoorn");
        System.out.println("Mansori Derksen");
        System.out.println("Johan Baardemans");
        System.out.println("Gert Jan");
        /*
        Hier komen namen van studenten die in de Class van Rachid staan


        */
        System.out.println();
        System.out.println("1) Terug naar hoofdmenu ");

        int keuze;

        if (scanner.hasNextInt() == true) {
            keuze = scanner.nextInt();
            scanner.nextLine();
            if (keuze == 1) {
                beginScherm();
            } else {
                System.out.println("Kies aub een menu. Druk op Enter om verder te gaan.");
                scanner.nextLine();
                scanner.nextLine();
                studentenLijst();
            }

        } else {
            System.out.println("Kies aub een getal. Druk op Enter om verder te gaan.");
            scanner.nextLine();
            scanner.nextLine();
            studentenLijst();
        }

    }

    public static void studentInschrijven () {
        Scanner scanner = new Scanner (System.in);
        System.out.println();
        System.out.println("1) Student Inschrijven");
        System.out.println();
        System.out.println("2) Terug naar hoofdmenu");

        int keuze;
        if (scanner.hasNextInt()) {
            keuze = scanner.nextInt();
            scanner.nextLine();
            if (keuze == 1) {
                //ga naar de Class van Rachid waar je student inschrijft
            } else if (keuze == 2) {
                beginScherm();
            } else {
                System.out.println("Kies aub een menu, druk op Enter om opnieuw te proberen.");
                scanner.nextLine();
                scanner.nextLine();
                studentInschrijven();
            }
        } else {
            System.out.println("Voer een getal in. Druk op Enter om opnieuw te proberen");
            scanner.nextLine();
            scanner.nextLine();
            studentInschrijven();
        }


    }

    public static void studentVerwijderen () {
        /*

Class van rachid student verwijdern met arraylist.remove(naam) en checken of de student er wel echt in is dus met  arraylist.contains(naam)


         */
    }

    public static void examenAfnemen () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welke examen wil je afnemen?");
        System.out.println();
        System.out.println("1) Theorie-Examen");
        System.out.println();
        System.out.println("2) Praktijk-Examen");
        System.out.println();
        System.out.println("3) Terug naar hoofdmenu");

        int keuze;
        if (scanner.hasNextInt() == true) {
            keuze = scanner.nextInt();
            scanner.nextLine();
            if (keuze == 1) {
                //Theorie Examen Class executeren
            } else if (keuze == 2) {
                //Praktijk Examen Class executeren
            } else if (keuze == 3) {
                beginScherm();
            } else {
                System.out.println("Kies aub een menu, druk Enter om verder te gaan");
                scanner.nextLine();
                examenAfnemen();
            }

        } else {
            System.out.println("Voer een getal in, druk op Enter om opnieuw te proberen");
            scanner.nextLine();
            scanner.nextLine();
            examenAfnemen();
        }
    }

    public static void afsluiten() {
        //code voor afsluiten programma
    }



}


//    public static void voerJeNaamInAlsStudent () {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welkom, je hebt voor student gekozen");
//        System.out.println();
//        System.out.printf("Voer je naam in: ");
//        studentNaam = scanner.next();
//        System.out.println();
//        System.out.println("Hallo " + studentNaam);
//        //beginScherm();
//    }

//    public static void beginScherm() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println();
//        System.out.println("Welkom bij rijschool de HHS (100% slagingspercentage), kies uit één van de onderstaande opties.");
//        System.out.println();
//        System.out.println("Wilt u inloggen als student of docent?");
//        System.out.println();
//        System.out.println("1) Ik ben een student");
//        System.out.println();
//        System.out.println("2) Ik ben een docent");
//        System.out.println();
//
//        int keuze;
//        if (scanner.hasNextInt() == true) {
//            keuze = scanner.nextInt();
//            scanner.nextLine();
//            if (keuze == 1) {
//                voerJeNaamInAlsStudent();
//            }
//            else if (keuze == 2) {
//                voerJeNaamInAlsDocent();
//            }else {
//                System.out.println("Kies aub een menu. Druk op Enter om verder te gaan.");
//                scanner.nextLine();
//                BEGINSCHERM();
//            }
//
//        } else {
//            System.out.println("Kies een getal");
//            BEGINSCHERM();
//        }
//
//    }