package sv.edu.ufg.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sv.edu.ufg.model.FormaPagoCuota;

@Repository
public class FormaPagoCuotaDaoImp implements FormaPagoCuotaDao {

	
	@Autowired SessionFactory sessionFactory;
	
	public void create(FormaPagoCuota r) {
		get().saveOrUpdate(r);
	}

	public void update(FormaPagoCuota r) {
		get().saveOrUpdate(r);
	}

	public void delete(FormaPagoCuota r) {
		get().delete(r);
	}

	public FormaPagoCuota find(int id) {
		return (FormaPagoCuota) get().get(FormaPagoCuota.class,id);
	}

	@SuppressWarnings("unchecked")
	public List<FormaPagoCuota> findAll() {
		return get().createCriteria(FormaPagoCuota.class).list();
	}

	public Session get(){
		return sessionFactory.getCurrentSession();
	}
}
