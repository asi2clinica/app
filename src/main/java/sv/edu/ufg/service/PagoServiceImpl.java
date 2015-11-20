package sv.edu.ufg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sv.edu.ufg.dao.PagoDao;
import sv.edu.ufg.model.Pago;

public class PagoServiceImpl implements PagosService {

	
	@Autowired PagoDao pagoDao;
	
	public void create(Pago r) {
		pagoDao.create(r);
	}

	public void update(Pago r) {
		pagoDao.update(r);
	}

	public void delete(Pago r) {
		pagoDao.delete(r);
	}

	public Pago find(int id) {
		return pagoDao.find(id);
	}

	public List<Pago> findAll() {
		return pagoDao.findAll();
	}

}
