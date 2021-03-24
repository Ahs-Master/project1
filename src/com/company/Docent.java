package com.company;

public class Docent extends Gebruiker {
    private static final Integer docentID = 1;
    private static final String userName = "Admin";
    private static final String password = "Password";

    //<------Contructor------>
    public Docent(String naam, String achternaam) {
        super(naam, achternaam);
    }
}