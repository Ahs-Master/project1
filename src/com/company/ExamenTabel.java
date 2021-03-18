package com.company;

public class ExamenTabel {

    static String examenNaam;
    static Integer aantalPogingen;
    static Integer aantalpunten;
    //ArrayList<Vragen> examenVragen;


    public ExamenTabel(String examenNaam)
    {
        this.examenNaam = examenNaam;
        //examenVragen.add(Vragen);
    }

    public void beginExamen()
    {
        //hier runnen we de examen/
    }

    public void setStudentIsGeslaagd()
    {

        if(aantalpunten>=15)
        {
            System.out.println("Je bent geslaagd voor de toets!");
            
        }
    }

}
