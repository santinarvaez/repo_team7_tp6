package ar.edu.unju.fi.tp4.model;

import org.springframework.stereotype.Component;



@Component
public class Producto {

	private int codigo, stock;
	private String nombre ,marca;
	private Double precio;
	
	public Producto( String nombre, int codigo, double precio, String marca, int stock) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.marca = marca;
		this.stock = stock;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	public Producto() {
		super();
	}
	
}
