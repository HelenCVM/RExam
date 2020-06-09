package ups.edu.ec.controlador;

import java.util.List;

import ups.edu.ec.modelo.Comida;
import ups.edu.ec.modelo.Pedido;


public interface ComidaDAO extends GenericDAO<Comida ,Integer>{
	
	List<Comida> findByNombre(String string);
	
	public List<Comida> buscarporCedula(String cedula);
}