package ups.edu.ec.controlador;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ups.edu.ec.modelo.Comida;


public class JPAComidaDAO extends JPAGenericDAO<Comida, Integer> implements ComidaDAO {

    public JPAComidaDAO() {
	super(Comida.class);
    }

    @Override
	public List<Comida> findByNombre(String nombre) {
		String jpql2="SELECT c FROM Comida c WHERE c.nombre='"+nombre+"'";
		List<?> comidas= em.createQuery(jpql2).getResultList();
		Set<Comida> p=new HashSet<Comida>();
		for (int i = 0; i < comidas.size(); i++) {			
			p.add((Comida) comidas.get(i));
		}
		List<Comida> list = new ArrayList<Comida>(p);
		return list;
		
	}
    
    public List<Comida> buscarporCedula(String nombre) {
        
        String query = "SELECT e " +
	      "FROM Comida e " +
	      "WHERE e.nombre='" + nombre +"'";
   List<Comida> res= em.createQuery(query,Comida.class).getResultList();          
	      return res;

}
    

}



