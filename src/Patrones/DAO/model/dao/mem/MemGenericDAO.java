package Patrones.DAO.model.dao.mem;

import java.util.HashMap;
import java.util.Map;

import Patrones.DAO.model.dao.GenericDAO;

public abstract class MemGenericDAO <T,ID> implements GenericDAO<T, ID>{
	
	private Map<ID, T> mapa=new HashMap<ID, T>();



	@Override
	public void create(T entity) {
		this.mapa.put(this.getID(entity), entity);
		
	}

	@Override
	public T read(ID id) {
		 return this.mapa.get(id);
		
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByID(ID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<T,ID> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<T,ID> findAll(int index, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	public abstract ID getID(T entity);
	
	


}
