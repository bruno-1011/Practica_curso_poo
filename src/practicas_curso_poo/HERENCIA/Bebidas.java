/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author DONATO
 */
public class Bebidas extends Producto{
    private String Sabor;
    private String Presentacion;
 

    public Bebidas(String nombre, String codigo, double precio,String marca, String tipo,String sabor,String presentacion){
        super(nombre,codigo,precio,marca,tipo);
        Sabor =sabor;
        Presentacion=presentacion;
    }

  

    public String getSabor() {
        return Sabor;
    }

    public void setSabor(String Sabor) {
        this.Sabor = Sabor;
    }

    public String getPresentacion() {
        return Presentacion;
    }

    public void setPresentacion(String Presentacion) {
        this.Presentacion = Presentacion;
    }
    
    
    
}
