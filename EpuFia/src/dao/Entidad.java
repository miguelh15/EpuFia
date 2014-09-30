package dao;

import java.util.List;

public interface Entidad<T> {
	
	public T insert(T t);
	
	public int update (T t);
	
	public int delete(T t);
	
	public List<T> findAll(Object...objects);
	
	public List<T> findAll();
	
	public T findById(String id);
	
	public T findById(T t);

}
