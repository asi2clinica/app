package sv.edu.ufg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sv.edu.ufg.dao.CitaDao;
import sv.edu.ufg.model.Cita;


@Service
@Transactional
public class CitaServiceImpl implements CitaDao{

	
	@Autowired CitaDao citaDao;
	
	public void create(Cita r) {
		citaDao.create(r);
	}

	public void update(Cita r) {
		citaDao.update(r);
	}

	public void delete(Cita r) {
		citaDao.delete(r);
	}

	public Cita find(int id) {
		return citaDao.find(id);
	}

	public List<Cita> findAll() {
		return citaDao.findAll();
	}

}
