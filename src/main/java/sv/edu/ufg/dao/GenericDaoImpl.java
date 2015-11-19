package sv.edu.ufg.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class GenericDaoImpl {
	
	@Autowired SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void create(Object r) {
		this.getSession().saveOrUpdate(r);
	}

	public void update(Object r) {
	 this.getSession().saveOrUpdate(r);

	}

	public void delete(Object r) {
		this.getSession().delete(r);
	}

	public Object find(int id) {
		return null;
	}

	public List<Object> findAll() {
		return null;
	}
	
	
}
