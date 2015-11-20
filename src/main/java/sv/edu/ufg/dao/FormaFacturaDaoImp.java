package sv.edu.ufg.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sv.edu.ufg.model.FormaFactura;



@Repository
public class FormaFacturaDaoImp implements FormaFacturaDao {

	@Autowired SessionFactory sessionFactory;
	
	public void create(FormaFactura r) {
		get().saveOrUpdate(r);
	}

	public void update(FormaFactura r) {
		get().saveOrUpdate(r);
	}

	public void delete(FormaFactura r) {
		get().delete(r);
	}

	public FormaFactura find(int id) {
		return (FormaFactura) get().get(FormaFactura.class,id);
	}

	@SuppressWarnings("unchecked")
	public List<FormaFactura> findAll() {
		return get().createCriteria(FormaFactura.class).list();
	}

	public Session get(){
		return sessionFactory.getCurrentSession();
	}
}
