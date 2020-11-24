/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football.management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author mmrs
 */
public class Fixture {
    public  int[] group = new int[12];
    public void createFixture(){
       
        
        
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=5; i<=16; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<12; i++) {
            group[i]=list.get(i);
            
        }
    
     for(int i=0;i<12;i++){
         System.out.println(group[i]);
     
     }
    }
    
}
