package sv.edu.ufg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.edu.ufg.dao.PersonaDao;

@Service
@Transactional
public class PersonaServiceImpl implements PersonaService {

	@Autowired PersonaDao personaDao;
	public void create(Object r) {
		personaDao.create(r);
	}

	public void update(Object r) {
		personaDao.update(r);
	}

	public void delete(Object r) {
		personaDao.delete(r);
	}

	public Object find(int id) {
		return personaDao.find(id);
	}

	public List<Object> findAll() {
		return personaDao.findAll();
	}

}
