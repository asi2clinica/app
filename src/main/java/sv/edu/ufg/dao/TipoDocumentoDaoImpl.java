package sv.edu.ufg.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sv.edu.ufg.model.TipoDocumento;


@Repository  
public class TipoDocumentoDaoImpl implements TipoDocumentoDao {

	@Autowired SessionFactory sessionFactory;
	public void create(TipoDocumento r) {
		get().saveOrUpdate(r);
	}

	public void update(TipoDocumento r) {
		get().saveOrUpdate(r);
	}

	public void delete(TipoDocumento r) {
		get().delete(r);
	}

	public TipoDocumento find(int id) {
		return (TipoDocumento) get().get(TipoDocumento.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<TipoDocumento> findAll() {
		return get().createCriteria(TipoDocumento.class).list();
	}
	
	private Session get(){
		return sessionFactory.getCurrentSession();
	}
	
	

}
