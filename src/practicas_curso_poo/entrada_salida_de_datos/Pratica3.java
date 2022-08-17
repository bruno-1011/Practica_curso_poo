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
public class Pratica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura_datos= new Scanner(System.in);
        System.out.println("anota edad");
        String edad=captura_datos.nextLine() ;
        //int edad=12;
        if (Integer.parseInt(edad)>=19){
        }else{
        System.out.println("mayor de edad");
        }
        System.out.println("menor de edad");
    }
    
}
