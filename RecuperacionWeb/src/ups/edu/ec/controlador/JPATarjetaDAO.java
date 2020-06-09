package ups.edu.ec.controlador;


import javax.persistence.Query;

import ups.edu.ec.modelo.TarjetaCredito;

public class JPATarjetaDAO extends JPAGenericDAO<TarjetaCredito, Integer> implements TarjetaDAO {

    public JPATarjetaDAO() {
	super(TarjetaCredito.class);
    }


    @Override
	public TarjetaCredito findByNumero(int numTar) {
				
		String jpql="SELECT t FROM TarjetaCredito t WHERE t.numero="+numTar;
		Query query=em.createQuery(jpql);
		TarjetaCredito  t=(TarjetaCredito ) query.getSingleResult();
		
//		String jpql2="SELECT t FROM Telefono t WHERE t.usuario.id="+u.getId();
//		List<?> tele= em.createQuery(jpql2).getResultList();
//		Set<Telefono> t=new HashSet<Telefono>();
//		for (int i = 0; i < tele.size(); i++) {			
//			t.add((Telefono) tele.get(i));
//		}
//			u.setTelefonos(t);
		return t;
	}
}



