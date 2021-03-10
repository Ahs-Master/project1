package com.company;

import java.util.Scanner;

public class Main {

    public static String naam;

    public static void main(String[] args) {
        voerJeNaamIn();
    }

    public static void voerJeNaamIn () {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Voer je naam in: ");
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
        System.out.println("Uw keuze: ");

        int keuze = scanner.nextInt();
    }
    public static void examensAfnemen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Theorie examen");
        System.out.println();
        System.out.println("2) Praktijk examen");
        System.out.println();
        System.out.printf("Kies uw examen:");

        if

    }
}
