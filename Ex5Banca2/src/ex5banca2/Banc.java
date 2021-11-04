/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5banca2;

/**
 *
 * @author arturv
 */
public class Banc {

    final int maxcomptes = 10;
    private Compte[] comptes;

    private String nom;
    private int numcomptes;
    private static int numerocuenta = 1000;

    public Banc(String nom) {
        this.nom = nom;
        comptes = new Compte[maxcomptes];
    }

    //muestra istado de cuentas del banco
    public void mostrallistat() {
        System.out.println("Nom del banc:" + nom);
        System.out.println("Hi ha " + numcomptes + " comptes registrades.");
        for (int cont = 0; cont < numcomptes; cont++) {
            System.out.println("Número de compta - " + comptes[cont].getnumero());
            System.out.println("Nom titular - " + comptes[cont].getnombre());
            System.out.println("Cognoms - " + comptes[cont].getapellidos());
            System.out.println("Saldo - " + comptes[cont].getsaldo());
        }

    }

    //pon dinero en una cuenta
    public void posadiners(int numcompte, String nom, double diners) {
        boolean sal = false;
        boolean encontrado = false;
        int cont = 0;
        if (diners > 0) {
            while (!sal) {
                if (cont < numcomptes) {
                    if (numcompte == comptes[cont].getnumero() && nom.equals(comptes[cont].getnombre())) {
                        encontrado = true;
                        sal = true;
                    } else {
                        cont++;
                    }
                } else {
                    sal = true;
                }
            }
            if (encontrado) {
                comptes[cont].setsaldo(comptes[cont].getsaldo() + diners);
                System.out.println("Saldo canviat.");
            } else {
                System.out.println("No es troba la compta.");
            }
        }
        else
        {
            System.out.println("La quantitat ha de esser major que 0.");
        }
    }

    //quita dinero de una cuenta
    public void treudiners(int numcompte, String nom, double diners) {
        boolean sal = false;
        boolean encontrado = false;
        int cont = 0;
        if (diners > 0) {
            while (!sal) {
                if (cont < numcomptes) {
                    if (numcompte == comptes[cont].getnumero() && nom.equals(comptes[cont].getnombre())) {
                        encontrado = true;
                        sal = true;
                    } else {
                        cont++;
                    }
                } else {
                    sal = true;
                }
            }
            if (encontrado) {
                if (comptes[cont].getsaldo() >= diners) {
                    comptes[cont].setsaldo(comptes[cont].getsaldo() - diners);
                    System.out.println("Saldo canviat.");
                } else {
                    System.out.println("La compta no te prou diners.");
                }
            } else {
                System.out.println("No es troba la compta.");
            }
        } else {
            System.out.println("La quantitat ha de esser major de 0.");
        }
    }

    //crea una cuenta
    public boolean creacompte(String nom, String cognoms, double saldo) {
        boolean retorna;

        if (numcomptes < maxcomptes) {
            if (saldo > 0) {
                comptes[numcomptes] = new Compte(numerocuenta, nom, cognoms, saldo);

                retorna = true;
            } else if (saldo == 0) {
                comptes[numcomptes] = new Compte(numerocuenta, nom, cognoms);
                retorna = true;
            } else {
                System.out.println("El saldo no pot esser negatiu.");
                retorna = false;
            }
        } else {
            System.out.println("No es poden afegir més comptes.");
            retorna = false;
        }

        if (retorna) {
            numerocuenta++;
            numcomptes++;
        }
        return retorna;
    }

    public String getnom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public void setnumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public int getnumerocuenta() {
        return numerocuenta;
    }

}
