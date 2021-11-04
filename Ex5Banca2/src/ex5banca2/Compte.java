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
public class Compte {
    private int numero;
    private String nombre;
    private String apellidos;
    private double saldo;
    
    public Compte(int numero, String nombre, String apellidos)
    {
        this.numero = numero;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.saldo = 0;
    }
    
    public Compte(int numero, String nombre, String apellidos, double saldo)
    {
        this.numero = numero;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.saldo = saldo;
    }
    
    public String getnombre()
    {
        return nombre;
    }
    
    public void setnombre(String nombre)
    {
        this.nombre = nombre;
    }
    
      public String getapellidos()
    {
        return apellidos;
    }
    
    public void setapellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }
   
    public double getsaldo()
    {
        return saldo;
    }
    
    public void setsaldo(double saldo)
    {
        this.saldo = saldo;
    }
    
     public int getnumero()
    {
        return numero;
    }
    
    public void setnumero(int numero)
    {
        this.numero = numero;
    }
    
}
