/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrada_salida_de_datos;

import java.util.Scanner;

/**
 *
 * @author TECNOLOGICO
 */
public class Entrada_salida_de_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura_datos= new Scanner(System.in);
        
        System.out.println("anota un numero1:");
        String numero1=captura_datos.nextLine();
        
        System.out.println("anota un numero2:");
        String numero2=captura_datos.nextLine();
        
        int suma= Integer.parseInt(numero1) + Integer.parseInt(numero2);
        System.out.println("la suma es:"+suma);
        
    }
    
}
