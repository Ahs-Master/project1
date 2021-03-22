package com.company;

import java.util.Scanner;

public class OpenVragen extends Vragen {
    Scanner scanner = new Scanner(System.in);
    String antwoord1 = scanner.hasNext();
    public boolean CheckVragen(){
        if (antwoord.equals(antwoord1)){
            return true;
        }
        else {
            return false;
        }
    }
}
