package ups.edu.ec.controlador;

public class JPADAOFactory extends DAOFactory {

	@Override
	public PedidoDAO getPedidoDAO() {
		return new JPAPedidoDAO();
	}
	
	public ComidaDAO getComidaDAO() {
		return new JPAComidaDAO();
	}
	
	public TarjetaDAO getTarjetaDAO() {
		return new JPATarjetaDAO();
	}
}
