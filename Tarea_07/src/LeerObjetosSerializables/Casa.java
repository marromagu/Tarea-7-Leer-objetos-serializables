package LeerObjetosSerializables;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Casa implements Serializable{
	private int nVentanas;
	private String descripcion;
	private double precio;
	
	public Casa(int nVentanas, String descripcion, double precio) {
		this.nVentanas = nVentanas;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public int getnVentanas() {
		return nVentanas;
	}

	public void setnVentanas(int nVentanas) {
		this.nVentanas = nVentanas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Casa [nVentanas=" + nVentanas + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}
}
