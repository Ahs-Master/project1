//package com.company;
//
//import java.util.Scanner;
//
//public abstract class Hoofdmenu {
//
//    public static String studentNaam;
//    public static String docentNaam;
//
//
//    //Dit toevoegen in UML
//    public static void voerJeNaamInAlsDocent () {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welkom, u heeft voor docent gekozen");
//        System.out.println();
//        System.out.printf("Voer uw naam in: ");
//        docentNaam = scanner.next();
//        System.out.println();
//        System.out.println("Hallo " + docentNaam);
//        //beginScherm();
//    }
//
//    //Dit toevoegen in UML
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
//
//
//    public void Intro() {
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
//                Intro();
//            }
//
//        } else {
//            System.out.println("Kies een getal");
//                Intro();
//        }
//    }
//
//    public void beginMenu() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println();
//        //System.out.println("Hallo " + naam);
//        System.out.println("Menu: ");
//        System.out.println();
//        System.out.println("1) Lijst met examens");
//        System.out.println();
//        System.out.println("2) Lijst met studenten");
//        System.out.println();
//        System.out.println("3) Nieuwe student inschrijven");
//        System.out.println();
//        System.out.println("4) Student verwijderen");
//        System.out.println();
//        System.out.println("5) Examen afnemen");
//        System.out.println();
//        System.out.println("6) Welke examens heeft student gehaald?");
//        System.out.println();
//        System.out.println("7) Welke student heeft de meeste examens gehaald?");
//        System.out.println();
//        System.out.println("0) Afsluiten");
//        System.out.println();
//        System.out.printf("Uw keuze: ");
//
//        int keuze;
//
//
//    }
//
//    public  void examenLijst () {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Lijst van examens");
//        System.out.println();
//        System.out.println("-Theorie Examen");
//        System.out.println();
//        System.out.println("-Praktijk Examen");
//        System.out.println();
//        System.out.printf("1) Terug naar hoofdmenu");
//
//        int keuze;
//
//        if (scanner.hasNextInt() == true) {
//            keuze = scanner.nextInt();
//            scanner.nextLine();
//            if (keuze == 1) {
//                Intro();
//            } else {
//                System.out.println("Kies aub een menu. Druk op Enter om verder te gaan.");
//                scanner.nextLine();
//                scanner.nextLine();
//                examenLijst();
//            }
//
//        } else {
//            System.out.println("Kies aub een getal. Druk op Enter om verder te gaan.");
//            scanner.nextLine();
//            scanner.nextLine();
//            examenLijst();
//        }
//
//    }
//
//    public void Statistiek() {
//
//    }
//
//    public void afsluiten() {
//
//    }
//
//}
