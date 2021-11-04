/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2circuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arturv
 */
public class Ex2Circuit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String opcio="1";
        //Se declara lista de bombillas
        ArrayList<Bombeta> bombetes = new ArrayList<>();
        //Se añade una bombilla a la lista
        bombetes.add(new Bombeta());
        //Se pone la lista conectada o perteneciendo a un nuevoo interruptor
        Interruptor elinterruptor = new Interruptor(bombetes);
        
        do
        {
           if(elinterruptor.getbombeta(0).getencesa())
           {
               System.out.println("La bombeta està encesa.");
           }
           else
           {
               System.out.println("La bombeta està apagada.");
           }
            System.out.println("Vols activar l’interruptor(prémer ENTER) o posa 0 per sortir:");
            try
            {
                  opcio=lector.readLine();
                  elinterruptor.activainterruptor();
            }
            catch(IOException ex)
            {
                System.out.println("Error entrant dades.");
            }
            
        }while(!opcio.equals("0"));
                
        
        
       
        
        
    }
    
}
