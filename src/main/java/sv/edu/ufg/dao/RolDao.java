package sv.edu.ufg.dao;

import java.util.List;

import sv.edu.ufg.model.Rol;

public interface RolDao {
	public void create(Rol r);
	public void update(Rol r);
	public void delete(Rol r);
	public Rol find(int id);
	public List<Rol> findAll();
}
