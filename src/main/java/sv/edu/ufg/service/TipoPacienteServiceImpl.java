package sv.edu.ufg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.edu.ufg.dao.TipoPacienteDao;

@Service
@Transactional
public class TipoPacienteServiceImpl implements TipoPacienteService {

	@Autowired TipoPacienteDao tipoPacienteDao;
	
	public void create(Object r) {
		tipoPacienteDao.create(r);
	}

	public void update(Object r) {
		tipoPacienteDao.update(r);
	}

	public void delete(Object r) {
		tipoPacienteDao.delete(r);
	}

	public Object find(int id) {
		return tipoPacienteDao.find(id);
	}

	public List<Object> findAll() {
		return tipoPacienteDao.findAll();
	}

}
