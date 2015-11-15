package sv.edu.ufg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.edu.ufg.dao.PacienteDao;


@Service
@Transactional
public class PacienteServiceImpl  implements PacienteService {

	
	@Autowired PacienteDao pacienteDao;
	
	public void create(Object r) {
		pacienteDao.create(r);
	}

	public void update(Object r) {
		pacienteDao.update(r);

	}

	public void delete(Object r) {
		pacienteDao.delete(r);
	}

	public Object find(int id) {
		return pacienteDao.find(id);
	}

	public List<Object> findAll() {
		return pacienteDao.findAll();
	}

}
