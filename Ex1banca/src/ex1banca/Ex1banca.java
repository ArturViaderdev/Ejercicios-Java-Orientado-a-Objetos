/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1banca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arturv
 */
public class Ex1banca {

    //Declaro la lista
    private static ArrayList<Compte> clients;

    /**
     * @param args the command line arguments
     */

    //Muestra una cuenta
    public static void mostra(Compte unacompta) {
        //Muesta nombre de cliente y saldo
        System.out.println("El client: " + unacompta.getnom() + " té un saldo de " + unacompta.getsaldo());
    }

    //Crea una cuenta preguntando al usuario
    public static void creacompte() {
        double saldo;
        Compte noucompte;

        String nom;
        Scanner entrada = new Scanner(System.in);
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        try {
            //Se piden los datos al usuario
            System.out.println("Introdueix el nom del compte.");
            nom = lector.readLine();
            System.out.println("Introdueix el saldo inicial.");
            saldo = entrada.nextDouble();
            //Se crea la cuenta en una variable
            noucompte = new Compte(nom, saldo);
            //Se añade la cuenta a la lista
            clients.add(noucompte);
            //Se muestra la nueva cuenta
            mostra(noucompte);

        } catch (IOException ex) {
            System.out.println("Error entrant dades.");
        }
    }

    //Devuelve la posición de un cliente o cuenta en la lista buscando por el nombre
    //Devuelve -1 si no lo encuentra.
    public static int donaposicio(String nom) {
        boolean trobat = false;
        boolean sortir = false;
        int cont = 0;
        while (!sortir) {
            if (cont < clients.size()) {
                if (clients.get(cont).getnom().equals(nom)) {
                    trobat = true;
                    sortir = true;
                } else {
                    cont++;
                }

            } else {
                sortir = true;
            }
        }
        if (!trobat) {
            cont = -1;
        }
        return cont;
    }

    //Pone o quita dinero de una cuenta preguntando al usuario
    public static void posadinerscompte(boolean afegeix) {
        String nom;
        int poscompte;
        double diners;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix el nom del compte.");
        try {
            nom = lector.readLine();
            poscompte = donaposicio(nom);
            if (poscompte != -1) {
                System.out.println("Introdueix la quantitat.");
                diners = entrada.nextDouble();
                if (diners > 0) {
                    //según el parámetro se añade o quita dinero
                    if (afegeix) {
                        clients.get(poscompte).setsaldo(clients.get(poscompte).getsaldo() + diners);
                    } else {
                        clients.get(poscompte).setsaldo(clients.get(poscompte).getsaldo() - diners);
                    }

                    System.out.println("Operació finalitzada.");
                    mostra(clients.get(poscompte));
                } else {
                    System.out.println("Els diners no poden ser menys de 0.");
                }
            } else {
                System.out.println("Compta no trobada.");
            }
        } catch (IOException ex) {
            System.out.println("Error introduint nom.");
        }
    }

    //Muestra todos los clientes o cuentas
    private static void mostratots() {
        for (Compte lacompta : clients) {
            mostra(lacompta);
        }
    }

    //Muestra el saldo de una cuenta pregunta al usuario cual
    public static void mostrasaldocompte() {
        String nom;
        int poscompte;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introdueix el nom del compte.");
        try {
            nom = lector.readLine();
            poscompte = donaposicio(nom);
            if (poscompte != -1) {
                mostra(clients.get(poscompte));
            } else {
                System.out.println("La compta no existeix.");
            }

        } catch (IOException ex) {
            System.out.println("Error introduint nom.");
        }
    }

    //Principal
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);

        clients = new ArrayList<>();
        do {
            //se muestra el menú
            System.out.println("1-Crea nou compte.");
            System.out.println("2-Posa diners de un compte.");
            System.out.println("3-Treu diners de un compte.");
            System.out.println("4-Consulta saldo de un compte.");
            System.out.println("5-Mostra tots el comptes amb el seu saldo.");
            System.out.println("0-Sortir.");

            try {
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        creacompte();
                        break;
                    case 2:
                        posadinerscompte(true);
                        break;
                    case 3:
                        posadinerscompte(false);
                        break;
                    case 4:
                        mostrasaldocompte();
                        break;
                    case 5:
                        mostratots();
                        break;
                    default:

                }

            } catch (Exception ex) {
                System.out.println("Error entrant dades.");
            }

        } while (opcion != 0);
        System.out.println("Adeu.");

    }

}
