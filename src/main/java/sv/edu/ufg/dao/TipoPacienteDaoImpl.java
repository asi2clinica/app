package sv.edu.ufg.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sv.edu.ufg.model.TipoPaciente;

@Repository
public class TipoPacienteDaoImpl  implements TipoPacienteDao {

	@Autowired SessionFactory sessionFactory;
	
	public void create(TipoPaciente r) {
		sessionFactory.getCurrentSession().saveOrUpdate(r);	
	}

	public void update(TipoPaciente r) {
		sessionFactory.getCurrentSession().saveOrUpdate(r);
	}

	public void delete(TipoPaciente r) {
		sessionFactory.getCurrentSession().delete(r);
		
	}

	public TipoPaciente find(int id) {
		return (TipoPaciente) sessionFactory.getCurrentSession().get(TipoPaciente.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<TipoPaciente> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(TipoPaciente.class).list();
	}

}
