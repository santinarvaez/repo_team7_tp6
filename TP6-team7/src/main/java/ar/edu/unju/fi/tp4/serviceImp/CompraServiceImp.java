package ar.edu.unju.fi.tp4.serviceImp;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp4.Util.TablaCompra;
import ar.edu.unju.fi.tp4.model.Compra;
import ar.edu.unju.fi.tp4.model.Producto;
import ar.edu.unju.fi.tp4.service.ICompraService;

@Service("CompraImp")
public class CompraServiceImp implements ICompraService{
	private List<Compra> compras = TablaCompra.listaCompras;

	
	private static final Log LOGGER = LogFactory.getLog(CompraServiceImp.class);
	
	public void generarTablaCompras(){
		
		Producto prod1 = new Producto("Laptop",254,1550,"Hp",16);
		compras.add(new Compra(156,prod1,4,169));
		
	}
	
	public void guardarCompras(Compra compra){
		
		if(compra==null) {
			generarTablaCompras();
		}
		LOGGER.info("COMPRA----------->" + compra.getProducto().getNombre());
		compras.add(compra); 
		
	}
	
	public List<Compra> obtenerCompras(){
		return compras;
	}

}
