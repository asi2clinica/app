package sv.edu.ufg.dao;

import java.util.List;

import sv.edu.ufg.model.Paciente;

public interface PacienteDao {
	public void create(Paciente r);
	public void update(Paciente r);
	public void delete(Paciente r);
	public Paciente find(int id);
	public List<Paciente> findAll();
}
