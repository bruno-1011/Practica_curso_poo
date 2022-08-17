
package herencia;

import java.util.ArrayList;
public class Principal {
    public static void main(String[] args){
        
        Bebidas crear_bebidas=new Bebidas("jumex","B112",20,"jumex","BEBIDA","jumex","lata");
        System.out.println("Nombre producto:"+ crear_bebidas.getNombre());
        System.out.println("Marca del producto:"+ crear_bebidas.getMarca());
        System.out.println("Sabor producto:"+ crear_bebidas.getSabor());
        
        Lacteos crear_Lacteos= new Lacteos(" yogurt","Bf254",35,"lala", "lacteo","10/5/2022",15.0 );
        System.out.println ("precio real lacteos");
        System.out.println(crear_lacteos);
        
    
    }
    
}
