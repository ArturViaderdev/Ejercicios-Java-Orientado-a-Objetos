/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3telefons;

import java.util.ArrayList;

/**
 *
 * @author arturv
 */
public class Ex3Telefons {
    private static ArrayList<Mobil> mobils;
    /**
     * @param args the command line arguments
     */
    
    //Crea dos móviles
    private static void creamobils()
    {
        //se crea un movil
        Mobil elmobil = new Mobil("666666666");
        //se añade el movil a la lista
        mobils.add(elmobil);
        elmobil = new Mobil("555555555");
        mobils.add(elmobil);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //se inicializa la lista
        mobils = new ArrayList<>();
        //se crean dos moviles
        creamobils();
        //se pone un mensaje para enviar
        mobils.get(0).setmissatgeperenviar("Missatge de prova");
        //se envia el mensaje al otro movil
        mobils.get(0).enviamissatge(mobils.get(1));
    }
    
}
