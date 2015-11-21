package sv.edu.ufg.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sv.edu.ufg.model.Factura;
import java.util.List;


@Repository
public class FacturaDaoImpl implements FacturaDao{

  	@Autowired SessionFactory sessionFactory;
  
    public void create(Factura arg0) {
  		        get().saveOrUpdate(arg0);
    }

    
    public void delete(Factura arg0) {
        		get().delete(arg0);
    }

    
    public Factura find(long arg0) {
        return (Factura) get().get(Factura.class,arg0);
    }

    
    @SuppressWarnings("unchecked")
	public List<Factura> findAll() {
        return get().createCriteria(Factura.class).list();
    }

    
    public void update(Factura arg0) {
        get().saveOrUpdate(arg0);
        
    }
  
  
    private Session get(){
      return sessionFactory.getCurrentSession();
    }
  
}
