package sv.edu.ufg.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sv.edu.ufg.model.Paciente;



@Repository
public class PacienteDaoImpl implements PacienteDao {

	@Autowired SessionFactory sessionFactory;
	
	public void create(Paciente r) {
		get().saveOrUpdate(r);
	}

	public void update(Paciente r) {
		get().saveOrUpdate(r);
		
	}

	public void delete(Paciente r) {
		get().delete(r);
		
	}

	public Paciente find(int id) {
		return (Paciente) get().get(Paciente.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Paciente> findAll() {
		return get().createCriteria(Paciente.class).list();
	}
	
	private Session get(){
		return sessionFactory.getCurrentSession();
	}

}
