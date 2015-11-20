package sv.edu.ufg.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sv.edu.ufg.model.Cita;


@Repository
public class CitaDaoImpl implements CitaDao{

	
	@Autowired SessionFactory sessionFactory;
	
	public void create(Cita r) {
		sessionFactory.getCurrentSession().saveOrUpdate(r);
	}

	public void update(Cita r) {
		this.create(r);
		
	}

	public void delete(Cita r) {
		sessionFactory.getCurrentSession().delete(r);
	}

	public Cita find(int id) {
		return (Cita)sessionFactory.getCurrentSession().get(Cita.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Cita> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Cita.class).list();
	}

	@SuppressWarnings("unchecked")
	public List<Cita> findByEstado() {
		Query query =  sessionFactory.getCurrentSession().getNamedQuery("Cita.findByEstado");
		return query.list();
	}

}
