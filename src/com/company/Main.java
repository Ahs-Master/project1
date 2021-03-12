package com.company;


public class Main {

    public static void main(String[] args) {



        System.out.println("Welkom bij (TeamNaam) RijSchool!");
        System.out.println();
        System.out.println("Wilt u inloggen als Student of Docent?");
        System.out.println();
        System.out.println("1).Student");
        System.out.println("2).Docent");
        System.out.println();
        System.out.println("U heeft voor docent gekozen. Om in te loggen als docent, voer in uw gebruikersnaam en password");
        System.out.println();
        System.out.println();
        System.out.println("Gebruikersnaam: BozeNeefo");
        System.out.println("Wachtwoord:     ZinnaPatrool");
        System.out.println();
        System.out.println();
        System.out.println("Welkom, BozeNeefo,");
        System.out.println();
        System.out.println();
        System.out.println("Druk op enter om door te gaan.");



        clearScreen();










    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}
