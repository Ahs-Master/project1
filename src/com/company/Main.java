package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



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
        System.out.println("Druk op enter om naar de menu te gaan.");
        pressAnyKeyToContinue();
        clearConsole();



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
        System.out.println("Druk op enter om naar de menu te gaan.");













    }
    public static void clearConsole(){

        for (int i = 0; i < 50; i++){
            System.out.println("");
        }


    }



    private static void pressAnyKeyToContinue()
    {
        try {System.in.read();
        }
        catch (Exception e){
        }
    }


}
