package com.company;

 public abstract class Gebruiker {
    public String naam;
    public String achternaam;

    //<------Contructor------>
    public Gebruiker(String name, String surname){
        this.naam = name;
        this.achternaam = surname;
    }
    //<------Accessor------>
    public String getFullNaam() {
        return String.format("%s + %s",naam,achternaam);
    }
}
