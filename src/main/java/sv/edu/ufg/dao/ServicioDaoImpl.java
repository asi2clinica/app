package sv.edu.ufg.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import sv.edu.ufg.model.Servicio;


@Repository
public class ServicioDaoImpl extends GenericDaoImpl implements ServicioDao {
	
	@Override
	public Object find(int id) {
		return getSession().get(Servicio.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> findAll() {
		return getSession().createCriteria(Servicio.class).list();
	}

}
