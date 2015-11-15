package sv.edu.ufg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.edu.ufg.dao.ServicioDao;


@Service
@Transactional
public class ServicioServiceImpl implements ServicioService {

	@Autowired ServicioDao servicioDao;
	
	public void create(Object r) {
		servicioDao.create(r);
	}

	public void update(Object r) {
		servicioDao.update(r);

	}

	public void delete(Object r) {
		servicioDao.delete(r);
	}

	public Object find(int id) {
		return servicioDao.find(id);
	}

	public List<Object> findAll() {
		return servicioDao.findAll();
	}

}
