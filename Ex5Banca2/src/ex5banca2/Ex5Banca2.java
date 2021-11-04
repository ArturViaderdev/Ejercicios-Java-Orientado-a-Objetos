/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5banca2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arturv
 */
public class Ex5Banca2 {

    private static ArrayList<Banc> bancs;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Scanner entrada = new Scanner(System.in);
        int numcompta;
        String nom;

        bancs = new ArrayList<>();
        //Creo dos bancos
        bancs.add(new Banc("La caixa"));
        bancs.add(new Banc("Banco Pastor"));
        //creo 5 clientes en un banco y 3 en otro
        bancs.get(0).creacompte("Artur", "Viader", 100);
        bancs.get(0).creacompte("Pedro", "Perez", 150);
        bancs.get(0).creacompte("Manolo", "García", 50);
        bancs.get(0).creacompte("Silvia", "García", 200);
        bancs.get(0).creacompte("Alberto", "Morera", 1000);
        bancs.get(1).creacompte("Oscar", "Mataix", 5000);
        bancs.get(1).creacompte("Luisa", "Ochoa", 10000);
        bancs.get(1).creacompte("Merce", "Viader", 90);

        //muestro el listado
        for (Banc elbanc : bancs) {
            elbanc.mostrallistat();

        }
        //pongo dinero en una cuenta
        bancs.get(0).posadiners(1001, "Pedro", 100);

        //quito dinero en una cuenta
        bancs.get(0).treudiners(1002, "Manolo", 100);
        for (Banc elbanc : bancs) {
            elbanc.mostrallistat();

        }

    }

}
