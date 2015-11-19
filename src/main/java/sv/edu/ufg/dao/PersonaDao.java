package sv.edu.ufg.dao;

import java.util.List;

import sv.edu.ufg.model.Persona;

public interface PersonaDao {
	public void create(Persona r);
	public void update(Persona r);
	public void delete(Persona r);
	public Persona find(int id);
	public List<Persona> findAll();
}
