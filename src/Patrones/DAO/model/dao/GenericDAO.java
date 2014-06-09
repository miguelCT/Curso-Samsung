package Patrones.DAO.model.dao;

import java.util.Map;

public interface GenericDAO <T,ID> {
	
	public void create(T entity );
	public T read(ID id);
	public void update(T entity);
	public void delete(T entity);
	public void deleteByID(ID id);
	public Map<T, ID>findAll();
	public Map<T,ID> findAll(int index, int size);
	

}
