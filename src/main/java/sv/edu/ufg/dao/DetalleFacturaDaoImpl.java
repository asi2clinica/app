package sv.edu.ufg.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sv.edu.ufg.model.DetalleFactua;


@Repository
public class DetalleFacturaDaoImpl implements DetalleFacturaDao {

@Autowired SessionFactory sessionFactory;
	
	public void create(DetalleFactua r) {
		get().saveOrUpdate(r);
	}

	public void update(DetalleFactua r) {
		get().saveOrUpdate(r);
	}

	public void delete(DetalleFactua r) {
		get().delete(r);
	}

	public DetalleFactua find(int id) {
		return (DetalleFactua) get().get(DetalleFactua.class,id);
	}

	@SuppressWarnings("unchecked")
	public List<DetalleFactua> findAll() {
		return get().createCriteria(DetalleFactua.class).list();
	}

	public Session get(){
		return sessionFactory.getCurrentSession();
	}

}
