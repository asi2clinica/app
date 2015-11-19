package sv.edu.ufg.service;

import java.util.List;

import sv.edu.ufg.model.Persona;

public interface PersonaService {
	public void create(Persona r);
	public void update(Persona r);
	public void delete(Persona r);
	public Persona find(int id);
	public List<Persona> findAll();
}
