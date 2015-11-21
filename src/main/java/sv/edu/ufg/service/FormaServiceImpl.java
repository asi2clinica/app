package sv.edu.ufg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sv.edu.ufg.dao.FormaPagoDao;
import sv.edu.ufg.model.FormaPago;


@Repository
@Transactional
public class FormaServiceImpl implements FormaService {

		
	@Autowired FormaPagoDao formaPagoDao;
	
	
	public void create(FormaPago r) {
		formaPagoDao.create(r);
	}

	public void update(FormaPago r) {
		formaPagoDao.update(r);
	}

	public void delete(FormaPago r) {
		formaPagoDao.delete(r);
	}

	public FormaPago find(int id) {
		return formaPagoDao.find(id);
	}

	public List<FormaPago> findAll() {
		return formaPagoDao.findAll();
	}

}
