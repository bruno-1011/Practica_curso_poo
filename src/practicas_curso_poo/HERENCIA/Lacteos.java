package herencia;

import java.util.ArrayList;

public class Lacteos extends Producto {
private String fecha_caducidad;
private double Descuento;

public Lacteos(String nombre, String codigo, double precio, String marca, String tipo, String fecha_caducidad,
		double descuentos) {
	super(nombre, codigo, precio, marca, tipo);
	this.fecha_caducidad = fecha_caducidad;
	this.Descuento = descuentos;
}
public void mostrarDatos(){
	System.out.println("\n nombre:"+getNombre()+"\n codigo:"+getCodigo()+"\n precio:"+getPrecio()+"\n marca:"+getMarca()+"\n tipo:"+getTipo()+"\n fecha de caducidad:"+fecha_caducidad);
 }

public String getFecha_caducidad() {
	return fecha_caducidad;
}
public void setFecha_caducidad(String fecha_caducidad) {
	this.fecha_caducidad = fecha_caducidad;
}
public double getDescuento() {
	return Descuento;
}
public void setDescuento(double descuento) {
	Descuento = descuento;
}
public double calcular_precio(double precio, double descuento) {
	precio=getPrecio();
	Descuento=getDescuento();
	return precio-descuento;
}
 public String lista_lapteos(String nombre, double descuento) {
	double descontar=0.1;
	 nombre= getNombre();
    descuento=getDescuento();
 
    if(descuento== descontar) {
    	ArrayList<String> lista1=new ArrayList<String>();
    	lista1.add(nombre);
    	//lista1.add(String toString descuento));
    }
 }
}