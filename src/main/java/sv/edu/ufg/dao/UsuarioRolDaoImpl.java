package sv.edu.ufg.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sv.edu.ufg.model.RolUsuario;

@Repository
public class UsuarioRolDaoImpl implements UsuarioRolDao {

	@Autowired SessionFactory sessionFactory;
	
	public void create(Object r) {
		sessionFactory.getCurrentSession().saveOrUpdate(r);
	}

	public void update(Object r) {
		this.create(r);
	}

	public void delete(Object r) {
		sessionFactory.getCurrentSession().delete(r);
	}

	public Object find(int id) {
		
		return sessionFactory.getCurrentSession().get(RolUsuario.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Object> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(RolUsuario.class).list();
	}

}
