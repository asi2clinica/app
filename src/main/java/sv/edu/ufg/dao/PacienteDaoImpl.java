package sv.edu.ufg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import sv.edu.ufg.model.Paciente;


@Repository
public class PacienteDaoImpl extends GenericDaoImpl implements PacienteDao {

	
	public Object find(int id) {
		return getSession().get(Paciente.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Object> findAll() {
		return getSession().createCriteria(Paciente.class).list();
	}

}
