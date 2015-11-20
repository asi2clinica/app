package sv.edu.ufg.dao;

import java.util.List;

import sv.edu.ufg.model.Cita;

public interface CitaDao {
	public void create(Cita r);
	public void update(Cita r);
	public void delete(Cita r);
	public Cita find(int id);
	public List<Cita> findAll();
	public List<Cita> findByEstado();
}
