package com.company;

public class Docent extends Gebruiker {
    private static Integer docentID = 1;
    private static String userName = "Admin";
    private static String password = "Password";

    //<------Contructor------>
    public Docent(String naam, String achternaam) {
        super(naam, achternaam);
    }
}