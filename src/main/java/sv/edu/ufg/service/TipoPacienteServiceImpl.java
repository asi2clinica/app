package sv.edu.ufg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.edu.ufg.dao.TipoPacienteDao;
import sv.edu.ufg.model.TipoPaciente;

@Service
@Transactional
public class TipoPacienteServiceImpl implements TipoPacienteService {

	@Autowired TipoPacienteDao tipoPacienteDao;
	
	public void create(TipoPaciente r) {
		tipoPacienteDao.create(r);
	}

	public void update(TipoPaciente r) {
		tipoPacienteDao.update(r);
	}

	public void delete(TipoPaciente r) {
		tipoPacienteDao.delete(r);
	}

	public TipoPaciente find(int id) {
		return tipoPacienteDao.find(id);
	}

	public List<TipoPaciente> findAll() {
		return tipoPacienteDao.findAll();
	}

}
