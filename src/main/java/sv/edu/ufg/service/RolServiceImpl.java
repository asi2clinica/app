package sv.edu.ufg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.edu.ufg.dao.RolDao;
import sv.edu.ufg.model.Rol;


@Service
@Transactional
public class RolServiceImpl implements RolService{

	@Autowired RolDao rolDao;
		
	public void create(Rol r) {
		rolDao.create(r);
	}

	public void update(Rol r) {
		rolDao.update(r);
	}

	public void delete(Rol r) {
		rolDao.delete(r);
	}

	public Rol find(int id) {
		return rolDao.find(id);
	}

	public List<Rol> findAll() {
		return rolDao.findAll();
	}

}
