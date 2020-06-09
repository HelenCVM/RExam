package ups.edu.ec.controlador;


import ups.edu.ec.modelo.TarjetaCredito;

public interface TarjetaDAO extends GenericDAO<TarjetaCredito,Integer>{
	
	TarjetaCredito findByNumero(int parseInt);
}