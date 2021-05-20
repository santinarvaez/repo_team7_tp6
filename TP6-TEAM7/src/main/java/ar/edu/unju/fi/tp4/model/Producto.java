package ar.edu.unju.fi.tp4.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Table(name="PRODUCTOS")
@Entity
@Component
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "prod_codigo", nullable = false)
	private int codigo;
	
	@Column(name = "prod_stock", nullable = false)
	private int stock;
	
	@Column(name = "prod_nombre")
	private String nombre;
	
	@Column(name = "prod_marca")
	private String marca;
	
	@Column(name = "prod_precio", nullable = false)
	private Double precio;
	
	
	public Producto( String nombre, int codigo, double precio, String marca, int stock, Long id) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.marca = marca;
		this.stock = stock;
		this.id = id;
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
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Producto() {
		super();
	}
	
	
	
	
}
