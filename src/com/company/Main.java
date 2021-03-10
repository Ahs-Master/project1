package com.company;

import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        beginScherm();
    }

    public static void voerJeNaamIn () {
        System.out.println("Voer je naam in: ");
    }
    public static void beginScherm() {
        System.out.println("Menu");
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

    }
}
