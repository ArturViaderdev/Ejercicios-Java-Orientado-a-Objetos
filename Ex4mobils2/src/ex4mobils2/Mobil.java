/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4mobils2;

/**
 *
 * @author arturv
 */
public class Mobil {

    private String numero;
    private String missatgeperenviar;
    private String missatgerebut;
    private String numeroorigen;
    private String numerodesti;
    private int saldo;

    public int getsaldo() {
        return saldo;
    }

    public void mostrasaldo() {
        System.out.println("El mòbil " + getnumero() + " té un saldo de " + getsaldo() + " euros.");
    }

    public void setsaldo(int saldo) {
        this.saldo = saldo;
    }

    public Mobil(String numero) {
        this.numero = numero;
        missatgeperenviar = "";
        missatgerebut = "";
        numeroorigen = "";
        numerodesti = "";
        saldo = 0;
    }

    public void setmissatgeperenviar(String missatgeperenviar) {
        this.missatgeperenviar = missatgeperenviar;

    }
    
    private String getmissatgeperenviar()
    {
        return missatgeperenviar;
    }

    public void mostramissatgerebut() { 
        System.out.println("El mòbil " + getnumero() + " ha rebut el missatge " + getmissatgerebut() + " del mòbil " + getnumeroorigen());         
    }

    public void repmissatge(String missatge, String numero) {
        setmissatgerebut(missatge);
        setnumeroorigen(numero);
        mostramissatgerebut();
    }

    private void setnumeroorigen(String numero) {
        numeroorigen = numero;
    }

    public void setmissatgerebut(String missatge) {
        missatgerebut = missatge;
    }

    private String getmissatgerebut() {
        return missatgerebut;
    }

    public String getnumeroorigen() {
        return numeroorigen;
    }

    public String getnumero() {
        return numero;
    }
    
    private void treusaldomissatge()
    {
        setsaldo(getsaldo() - getmissatgeperenviar().length());
    }

    public void enviamissatge(Mobil destinatari) {
        if (getsaldo() >= getmissatgeperenviar().length()) {
            System.out.println("El mòbil " + getnumero() + " té prou saldo per a enviar el Missatge:" + getmissatgeperenviar());
            System.out.println("El mobil " + getnumero() + " envia missatge al número " + destinatari.getnumero());
            treusaldomissatge();
            mostrasaldo();
            destinatari.repmissatge(missatgeperenviar, getnumero());
        }
        else
        {
            System.out.println("El mòbil " + getnumero() + " no té prou saldo per a enviar el Missatge:" + getmissatgeperenviar());
        }
    }
}
