/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1banca;

/**
 *
 * @author arturv
 */

//Classe compte
public class Compte {
    private double saldo;
    private String nom;
    
    public Compte(String nom, double saldo)
    {
        this.nom = nom;
        this.saldo = saldo;
    }
    
    public double getsaldo()
    {
        return saldo;
    }
    
    public void setsaldo(double saldo)
    {
        this.saldo = saldo;
    }
    
    public String getnom()
    {
        return nom;
    }
    
    public void setnom(String nom)
    {
        this.nom = nom;
    }
   
}
