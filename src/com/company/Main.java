package com.company;

import java.util.Scanner;

public class Main {

    public static String naam;

    public static void main(String[] args) {


        voerJeNaamIn();
        Menu.menu();

        //Clean en overzichtelijker.
        //Object Georienteerd




    }

    public static void voerJeNaamIn () {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Voer je naam in: ");
        naam = scanner.next();

        Student student =  new Student(naam);
    }

}
