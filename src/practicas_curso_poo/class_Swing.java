/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas_curso_poo;

import javax.swing.*;


public class class_Swing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = JOptionPane.showInputDialog("Anota tu nombre:");
        String apellido = JOptionPane.showInputDialog("Anota tu apellido:");
        
        JOptionPane.showMessageDialog(null,"tu nombre y apellido es ["+( nombre + apellido )+"]:"); 
    }
    
}
