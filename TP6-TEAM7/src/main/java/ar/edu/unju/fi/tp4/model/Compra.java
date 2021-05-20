package ar.edu.unju.fi.tp4.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Table(name="COMPRAS")
@Entity
@Component
public class Compra {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="compra_id", nullable = true)
		private int id;
		
		@Column(name="compra_cant", nullable = true)
		private int cantidad;
		
		@Column(name="compra_total", nullable = true)
		private double total;
		
		@Autowired
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="prod_codigo", nullable = true)
		private Producto producto;
		
		
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
