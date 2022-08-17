/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;


 import java.util.ArrayList;
public class practica1 {
    
    public static void main(String[] arg) {
        // Todo auto-generated method stub
        
        ArrayList<String> listas_marcas_laps= new ArrayList<String>();
        
        listas_marcas_laps.add("LENOVO");
        listas_marcas_laps.add("HP");
        listas_marcas_laps.add("HUAWEI");
        listas_marcas_laps.add("DELL");
        
        System.out.println("Marcas laptos" + listas_marcas_laps);
        System.out.println(listas_marcas_laps.get(2));
        System.out.println(listas_marcas_laps.size());
        
          listas_marcas_laps.remove(1);
        System.out.println(listas_marcas_laps);
          listas_marcas_laps.set(2,"TOSHIBA");
          System.out.println(listas_marcas_laps);
          
          for(String i:listas_marcas_laps) {
              System.out.println(i);
          }
        
        
       
    }
}
