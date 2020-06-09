package ups.edu.ec.controlador;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JPAGenericDAO <T, ID> implements GenericDAO<T, ID> {

	private Class<T> persistentClass;
    protected EntityManager em;

    public JPAGenericDAO(Class<T> persistentClass) {
	this.persistentClass = persistentClass;
	this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
    }

    @Override
    public void create(T entity) {
	em.getTransaction().begin();
	try {
	    em.persist(entity);
	    em.getTransaction().commit();
	} catch (Exception e) {
	    System.out.println(">>>> ERROR:JPAGenericDAO:create " + e);
	    if (em.getTransaction().isActive())
		em.getTransaction().rollback();
	}
    }

    @Override
    public T read(ID id) {
	return em.find(persistentClass, id);
    }
    
    public T readd(String id) {
		return em.find(persistentClass, id);
	    }
    
    public long queryEmpSalary(String deptName, String empName) {
        String query = "SELECT e.salary " +
        "FROM Employee e " +
        "WHERE e.department.name = '" + deptName +
        "' AND " +
        " e.name = '" + empName + "'";
       return em.createQuery(query, Long.class).getSingleResult();
     }

    @Override
    public void update(T entity) {
	em.getTransaction().begin();
	try {
	    em.merge(entity);
	    em.getTransaction().commit();
	} catch (Exception e) {
	    System.out.println(">>>> ERROR:JPAGenericDAO:update " + e);
	    if (em.getTransaction().isActive())
		em.getTransaction().rollback();
	}
    }

    // entity debe estar en estado de "Managed"
    @Override
    public void delete(T entity) {
	em.getTransaction().begin();
	try {
	    em.remove(entity);
	    em.getTransaction().commit();
	} catch (Exception e) {
	    System.out.println(">>>> ERROR:JPAGenericDAO:delete " + e);
	    if (em.getTransaction().isActive())
		em.getTransaction().rollback();
	}
    }

    @Override
    public void deleteByID(ID id) {
	T entity = this.read(id);
	if (entity != null)
	    this.delete(entity);
    }
    
    

    @Override
    public List<T> find() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<T> find(String[] attributes, String[] values) {
	// TODO Auto-generated method stub
	return null;
    }

   
}
