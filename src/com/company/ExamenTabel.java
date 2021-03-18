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
        TheorieExamenToets.ToetsMakken();
    }

    public void setStudentIsGeslaagd(Student student)
    {

        if(aantalpunten>=15)
        {
            Student.setWelGeslaagd(student);
            System.out.println("Je bent geslaagd voor de toets!");

        }

        else if(aantalpunten<=14)
        {
            System.out.println("Helaas, je bent gezakt");
        }
    }

    public Integer getAantalPogingen()
    {
        return aantalPogingen;
    }

}
