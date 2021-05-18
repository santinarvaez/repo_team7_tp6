package ar.edu.unju.fi.tp4.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Compra {
		private int id;
		@Autowired
		private Producto producto;
		private int cantidad;
		private double total;
		
		
		//CONSTRUCTORES
		
		public Compra() {
			// TODO Auto-generated constructor stub
		}
		
		
		/**
		 * 
		 * @param id
		 * @param producto
		 * @param cantidad
		 * @param total
		 */
		
		public Compra(int id, Producto producto, int cantidad, double total) {
			super();
			this.id = id;
			this.producto = producto;
			this.cantidad = cantidad;
		}
		
		//GETTERS AND SETTERS
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Producto getProducto() {
			return producto;
		}

		public void setProducto(Producto producto) {
			this.producto = producto;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}


		public void setTotal(double total) {
		}
		
		
		public Double getTotal() {		
			int  cant;
			double pre , total;
			pre=this.producto.getPrecio();
			cant=this.cantidad;
			total=pre*cant;
			return total;
		}
		
		
		
}
