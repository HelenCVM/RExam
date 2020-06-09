package ups.edu.ec.controlador;

import java.io.IOException;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ups.edu.ec.modelo.Comida;
import ups.edu.ec.modelo.Pedido;
import ups.edu.ec.modelo.TarjetaCredito;

/**
 * Servlet implementation class CreacionPedido
 */
@WebServlet("/CreacionPedido")
public class CreacionPedido extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Pedido pe=new Pedido();
	Comida co=new Comida();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreacionPedido() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PedidoDAO pedidoDAO = DAOFactory.getFactory().getPedidoDAO();
		ComidaDAO comidaDAO = DAOFactory.getFactory().getComidaDAO();
		TarjetaDAO tarjetaDAO = DAOFactory.getFactory().getTarjetaDAO();
		
		 EntityManager em =Persistence.createEntityManagerFactory("jpa").createEntityManager();
		
	
		String cliente =request.getParameter("cliente");
		String observaciones =request.getParameter("observaciones");
		
		
		String nombre =request.getParameter("nombre");
		String precioUnitario =request.getParameter("precio");
		double pre=Double.parseDouble(precioUnitario);
		
		
		String numerotar =request.getParameter("numero");
		int num=Integer.parseInt(numerotar);
		
		String opciones =request.getParameter("opcion");
		
 
		if(opciones.equals("si"))
		{
			TarjetaCredito tar= tarjetaDAO.findByNumero(num);
			pe.setTarjeta(tar);
			pe.setObservaciones(observaciones);
			pe.setFecha(new GregorianCalendar());
			
			pedidoDAO.create(pe);
			request.getRequestDispatcher("/JSPs/listar.jsp").forward(request,  response);
		}else {
			co.setNombre(nombre);
			co.setPreciouni(pre);
		    co.setPedidos(pe);
		    
			pe.setCliente(cliente);
			pe.addComida(co);
			pe.calcularComidas();
			
			request.setAttribute("elpedido", pe);
			request.getRequestDispatcher("/JSPs/creacionCuenta.jsp").forward(request,  response);
		}
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
