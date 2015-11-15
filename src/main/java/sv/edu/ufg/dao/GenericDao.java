package sv.edu.ufg.dao;

import java.util.List;

public interface GenericDao {
	public void create(Object r);
	public void update(Object r);
	public void delete(Object r);
	public Object find(int id);
	public List<Object> findAll();
}
