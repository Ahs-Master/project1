package com.company;

import java.util.ArrayList;

public class ExamenTabel {

    public static String examenNaam;
    public static Integer aantalPogingen;
    public static Integer aantalpunten;
    public static ArrayList <Vragen> examenVragen;


    public ExamenTabel(String examenNaam)
    {
        this.examenNaam = examenNaam;
        examenVragen.add(Vragen);
    }

    public void beginExamen()
    {
        TheorieExamenToets.ToetsMakken();
    }

    public void setStudentIsGeslaagd(Student student)
    {

        if(aantalpunten>=11)
        {
            Student.setWelGeslaagd(student);
            System.out.printf("Je bent geslaagd voor de toets %s!",ExamenTabel.examenNaam);

        }

        else {
            System.out.println("Helaas, je bent gezakt");
        }
    }

    public Integer getAantalPogingen()
    {
        return aantalPogingen;
    }

}
