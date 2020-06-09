package ups.edu.ec.controlador;

import java.util.GregorianCalendar;

import ups.edu.ec.modelo.TarjetaCredito;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TarjetaDAO tarjetaDAO = DAOFactory.getFactory().getTarjetaDAO();

		tarjetaDAO.create(new TarjetaCredito("400012", "visa", "112", new GregorianCalendar()));
		tarjetaDAO.create(new TarjetaCredito("500012","diners","623",new GregorianCalendar()));
		tarjetaDAO.create(new TarjetaCredito("600012","master","431",new GregorianCalendar()));


		
		PedidoDAO pedidoDAO=DAOFactory.getFactory().getPedidoDAO();
		
		
		System.out.println(pedidoDAO.findByNumTar("234987"));
	
		System.out.println(pedidoDAO.findByComida("bolon"));
	}

}
