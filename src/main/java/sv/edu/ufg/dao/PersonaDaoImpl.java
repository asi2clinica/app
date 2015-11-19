package sv.edu.ufg.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sv.edu.ufg.model.Persona;

@Repository
public class PersonaDaoImpl implements PersonaDao {

	@Autowired SessionFactory sessionFactory;
	public void create(Persona r) {
		get().saveOrUpdate(r);
	}

	public void update(Persona r) {
		get().saveOrUpdate(r);
	}

	public void delete(Persona r) {
		get().delete(r);
	}

	public Persona find(int id) {
		return (Persona) get().get(Persona.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Persona> findAll() {
		return get().createCriteria(Persona.class).list();
	}
	
	private Session get(){
		return sessionFactory.getCurrentSession();
	}
	
}
