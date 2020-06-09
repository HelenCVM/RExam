package ups.edu.ec.controlador;


public abstract class DAOFactory {

	 protected static DAOFactory factory = new JPADAOFactory();

	    public static DAOFactory getFactory() {
		return factory;
	    }

	    public abstract PedidoDAO getPedidoDAO();
	    
	    public abstract ComidaDAO getComidaDAO();
	    
	    public abstract TarjetaDAO getTarjetaDAO();
}

