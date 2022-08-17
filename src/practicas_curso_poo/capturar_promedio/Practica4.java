
package practicas_curso_poo.capturar_promedio;

import java.util.Scanner;

ic class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captura_promedio=new Scanner(System.in);
        String curso="poo";
        System.out.println("Anota calificacion");
        String promedio=captura_promedio.nextLine();
        
        if (Integer.parseInt(promedio)>=70 && curso=="poo"){
             System.out.println("bienvenido al curso de POO");
        }else{
        System.out.println("no aprobaste el curso de POO");
        }  
       
    }
    }
    

