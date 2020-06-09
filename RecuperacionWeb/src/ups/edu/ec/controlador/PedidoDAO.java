package ups.edu.ec.controlador;

import java.util.List;

import ups.edu.ec.modelo.Pedido;




public interface PedidoDAO extends GenericDAO<Pedido ,Integer>{
	
	List<Pedido> findByComida(String string);

	List<Pedido> findByNumTar(String string);

}