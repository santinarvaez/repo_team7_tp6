package ar.edu.unju.fi.tp4.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.model.Producto;
import ar.edu.unju.fi.tp4.service.IProductoService;




@Service
public class ProductosServiceImp implements IProductoService {
	private static final Log LOGGER = LogFactory.getLog(ProductosServiceImp.class);
	@Autowired
	Producto producto;
	
	List<Producto> productos = new ArrayList<Producto>();
	public ProductosServiceImp() {
		Producto e1 = new Producto("Notebook", 1256, 50000, "Hp", 1000 );
		Producto e2 = new Producto("impresora", 1264, 3000, "Hp", 1050);
		Producto e3 = new Producto("Cartucho de tinta", 1274, 2000, "Hp", 510);
		this.productos.add(e1);
		this.productos.add(e2);
		this.productos.add(e3);
		
		
		
	}
	
	@Override
	public void addProducto(Producto producto) {
		this.productos.add(producto);
		
	}

	@Override
	public Producto getUltimoProducto() {
		int indiceUltimoProducto = productos.size() -1;
		Producto producto = productos.get(indiceUltimoProducto);
		return producto;
	}
	@Override
	public Producto getProducto(){
		LOGGER.info("SERVICE: IProductoService -> ProductoServiceImp");
		LOGGER.info("METHOD: getProducto()");
		LOGGER.info("RESULT:a object Producto");
		return this.producto;
	}
	@Override
	public List<Producto> getAllProductos() {
		return this.productos;
	}
	
	@Override
	public Producto getProductoForId(int id) {
		Producto prod = new Producto();
		for(Producto p: productos) {
			if(p.getCodigo() == id) {
				prod = p; 
			}
		}
		LOGGER.info("--------------->PRODUCTOIMP"+prod.getNombre());
	return prod;
	}
}
