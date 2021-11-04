/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3telefons;

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
    
    public Mobil(String numero)
    {
        this.numero = numero;
        missatgeperenviar="";
        missatgerebut ="";
        numeroorigen="";
        numerodesti="";   
    }
       
    public void setmissatgeperenviar(String missatgeperenviar)
    {
        this.missatgeperenviar = missatgeperenviar;
       
    }

    public void mostramissatgerebut()
    {
        System.out.println("El missatge rebut és " + getmissatgerebut());
        System.out.println("El número de origen és " + getnumeroorigen()); 
    }
    
    public void repmissatge(String missatge, String numero)
    {
        setmissatgerebut(missatge);
        setnumeroorigen(numero);
        mostramissatgerebut();
    }
    
    private void setnumeroorigen(String numero)
    {
        numeroorigen = numero;
    }
    
    public void setmissatgerebut(String missatge)
    {
        missatgerebut = missatge;
    }
    
    private String getmissatgerebut()
    {
        return missatgerebut;
    }
    
   
    
   public String getnumeroorigen()
   {
       return numeroorigen;
   }
    
    public String getnumero(){
        return numero;
    }
  
    public void enviamissatge(Mobil destinatari)
    {
        System.out.println("El mobil " + getnumero() +  " envia missatge al número " + destinatari.getnumero());
        destinatari.repmissatge(missatgeperenviar, getnumero());
        
    }
   
   
}
