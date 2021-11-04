/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4mobils2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author arturv
 */
public class Ex4mobils2 {

    private static ArrayList<Mobil> mobils;

    private static void creamobils() {
        Mobil elmobil = new Mobil("666666666");
        mobils.add(elmobil);
        elmobil = new Mobil("555555555");
        mobils.add(elmobil);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String missatge="";
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        mobils = new ArrayList<>();
        creamobils();
        mobils.get(0).setsaldo(120);
        mobils.get(0).mostrasaldo();
        do {
            try {
                System.out.println("Escriure missatge: (o 0 per sortir)");
                missatge = lector.readLine();
                if(!missatge.equals("0"))
                {
                      mobils.get(0).setmissatgeperenviar(missatge);
                      mobils.get(0).enviamissatge(mobils.get(1));
                }
              
            } catch (IOException ex) {
                System.out.println("Error entrada dades");
            }
        }
        while(!missatge.equals("0"));
    }
}
