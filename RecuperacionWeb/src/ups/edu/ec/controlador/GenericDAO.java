package ups.edu.ec.controlador;

import java.util.List;

public interface GenericDAO<T, ID> {

	 public void create(T entity);

	    public T read(ID id);
	    
	    public T readd(String id);

	    public void update(T entity);

	    public void delete(T entity);

	    public void deleteByID(ID id);

	    public List<T> find();

	    public List<T> find(String[] attributes, String[] values); // like + and

	 

	
}