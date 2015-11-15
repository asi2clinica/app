package sv.edu.ufg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.edu.ufg.dao.SucursalDao;

@Service
@Transactional
public class SucursalServiceImpl implements SucursalService {

	
	@Autowired SucursalDao sucursalDao;
	
	public void create(Object r) {
		sucursalDao.create(r);
	}

	public void update(Object r) {
		sucursalDao.update(r);
	}

	public void delete(Object r) {
		sucursalDao.delete(r);
	}

	public Object find(int id) {
		
		return sucursalDao.find(id);
	}

	public List<Object> findAll() {
		return sucursalDao.findAll();
	}

}
