package sv.edu.ufg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.edu.ufg.dao.PersonaDao;
import sv.edu.ufg.model.Persona;

@Service
@Transactional
public class PersonaServiceImpl implements PersonaService {

	@Autowired PersonaDao personaDao;
	public void create(Persona r) {
		personaDao.create(r);
	}

	public void update(Persona r) {
		personaDao.update(r);
	}

	public void delete(Persona r) {
		personaDao.delete(r);
	}

	public Persona find(int id) {
		return personaDao.find(id);
	}

	public List<Persona> findAll() {
		return personaDao.findAll();
	}
}
