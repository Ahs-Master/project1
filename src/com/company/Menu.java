package com.company;

import java.util.Scanner;

public class Menu {

    public static String naam;


    public static void voerJeNaamIn () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer je naam in: ");
        naam = scanner.next();
        beginScherm();
    }
    public static void beginScherm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Hallo " + naam);
        System.out.println("Menu: ");
        System.out.println();
        System.out.println("1) Lijst met examens");
        System.out.println();
        System.out.println("2) Lijst met studenten");
        System.out.println();
        System.out.println("3) Nieuwe student inschrijven");
        System.out.println();
        System.out.println("4) Student verwijderen");
        System.out.println();
        System.out.println("5) Examen afnemen");
        System.out.println();
        System.out.println("6) Welke examens heeft student gehaald?");
        System.out.println();
        System.out.println("7) Welke student heeft de meeste examens gehaald?");
        System.out.println();
        System.out.println("0) Afsluiten");
        System.out.println();
        System.out.print("Uw keuze: ");

        int keuze;

        if (scanner.hasNextInt()) {
            keuze = scanner.nextInt();
            scanner.nextLine();
            if (keuze == 1) {
                examenLijst();
            } else if (keuze == 2) {
                System.out.println("ga naar menu van 2");
            } else if (keuze == 3) {
                System.out.println("ga naar menu van 3");
            } else if (keuze == 4) {
                System.out.println("ga naar menu van 4");
            } else if (keuze == 5) {
                Menu.examenAfnemen();
            } else if (keuze == 6) {
                System.out.println("ga naar menu van 6");
            } else if (keuze == 7) {
                System.out.println("ga naar menu van 7");
            } else if (keuze == 0) {
                System.out.println("ga naar menu van 0");
            } else {
                System.out.println("Kies aub een menu... Druk op Enter om verder te gaan");
                scanner.nextLine();
                beginScherm();
            }
        } else {
            System.out.println("Voer een getal in! Probeer het opnieuw. Druk Enter");
            scanner.nextLine();
            scanner.nextLine();
            beginScherm();
        }




    }
    public static void examenAfnemen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Theorie examen");
        System.out.println();
        System.out.println("2) Praktijk examen");
        System.out.println();
        System.out.print("Kies uw examen: ");

        int examen;
        examen = scanner.nextInt();
        if (examen == 1) {
        } else if (examen == 2) {
        } else {
            examenAfnemen();
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
        System.out.println("1) Terug naar hoofdmenu");

        int keuze;

        if (scanner.hasNextInt()) {
            keuze = scanner.nextInt();
            scanner.nextLine();
            if (keuze == 1) {
                beginScherm();
            } else {
                System.out.println("Kies aub een menu. Druk op Enter om verder te gaan.");
                scanner.nextLine();
                examenLijst();
            }

        } else {
            System.out.println("Kies aub een getal. Druk op Enter om verder te gaan.");
            scanner.nextLine();
            examenLijst();
        }

    }


}
