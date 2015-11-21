package sv.edu.ufg.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sv.edu.ufg.model.FormaPago;

@Repository
public class FormaPagoImpl implements FormaPagoDao {

	
	@Autowired SessionFactory sessionFactory;
	
	public void create(FormaPago r) {
		get().saveOrUpdate(r);
	}

	public void update(FormaPago r) {
		get().saveOrUpdate(r);
	}

	public void delete(FormaPago r) {
		get().delete(r);
	}

	public FormaPago find(int id) {
		return (FormaPago) get().get(FormaPago.class,id);
	}

	@SuppressWarnings("unchecked")
	public List<FormaPago> findAll() {
		return get().createCriteria(FormaPago.class).list();
	}

	public Session get(){
		return sessionFactory.getCurrentSession();
	}
	
	
}
