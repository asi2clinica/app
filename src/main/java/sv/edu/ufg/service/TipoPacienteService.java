package sv.edu.ufg.service;



import java.util.List;
import sv.edu.ufg.model.TipoPaciente;



public interface TipoPacienteService  {
	public void create(TipoPaciente r);
	public void update(TipoPaciente r);
	public void delete(TipoPaciente r);
	public TipoPaciente find(int id);
	public List<TipoPaciente> findAll();
}
