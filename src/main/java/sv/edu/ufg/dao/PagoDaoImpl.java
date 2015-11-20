package sv.edu.ufg.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sv.edu.ufg.model.Pago;


@Repository
public class PagoDaoImpl implements PagoDao {

	@Autowired SessionFactory sessionFactory;
	
	public void create(Pago r) {
		get().saveOrUpdate(r);
	}

	public void update(Pago r) {
		get().saveOrUpdate(r);

	}

	public void delete(Pago r) {
		get().delete(r);
	}

	public Pago find(int id) {
		return (Pago)get().get(Pago.class,id);
	}

	@SuppressWarnings("unchecked")
	public List<Pago> findAll() {
		return get().createCriteria(Pago.class).list();
	}
	
	private Session get(){
		return sessionFactory.getCurrentSession();
	}

}
