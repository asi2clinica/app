package sv.edu.ufg.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sv.edu.ufg.model.Rol;


@Repository
public class RolDaoImpl implements RolDao{

	@Autowired SessionFactory sessionFactory;
 	
	public void create(Rol r) {
		sessionFactory.getCurrentSession().saveOrUpdate(r);
	}

	public void update(Rol r) {
		sessionFactory.getCurrentSession().saveOrUpdate(r);
	}

	public void delete(Rol r) {
		sessionFactory.getCurrentSession().delete(r);
	}

	public Rol find(int id) {
		return (Rol) sessionFactory.getCurrentSession().get(Rol.class,id);
	}

	@SuppressWarnings("unchecked")
	public List<Rol> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Rol.class).list();
	}

}
