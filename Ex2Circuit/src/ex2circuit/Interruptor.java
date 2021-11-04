/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2circuit;

import java.util.ArrayList;

/**
 *
 * @author arturv
 */
public class Interruptor {
    static ArrayList<Bombeta> bombetes = new ArrayList<>();
    private boolean ences;

    public Bombeta getbombeta(int num)
    {
        return bombetes.get(num);
    }
    
    public Interruptor(ArrayList<Bombeta> bombetes)
    {
        ences = false;
        this.bombetes = bombetes;
    }
    
    public void activainterruptor()
    {
        if(ences)
        {
            ences=false;
        }
        else
        {
            ences=true;
        }
        
        for(Bombeta labombeta:bombetes)
        {
            labombeta.setencesa(ences);
        }
    }
}
