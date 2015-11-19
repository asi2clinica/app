package sv.edu.ufg.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.edu.ufg.dao.PacienteDao;
import sv.edu.ufg.dao.PersonaDao;
import sv.edu.ufg.dao.TipoPacienteDao;
import sv.edu.ufg.model.Paciente;
import sv.edu.ufg.model.Persona;


@Service
@Transactional
public class PacienteServiceImpl  implements PacienteService {

	 
	@Autowired PacienteDao pacienteDao;
	@Autowired PersonaDao  personaDao;
	@Autowired TipoPacienteDao tipoPacienteDao;
	

	public List<Paciente> findAll() {
		return pacienteDao.findAll();
	}

	public void create(Paciente r) {
		r.getPersona().setFregistro(new Date());
		personaDao.create(r.getPersona());
		r.setTipoPaciente(tipoPacienteDao.find(r.getTipo()));
		pacienteDao.create(r);
	}

	public void update(Paciente r) 
   {
     personaDao.update(r.getPersona());
     r.setTipoPaciente(tipoPacienteDao.find(r.getTipo()));
     pacienteDao.update(r); 
	}

	public void delete(Paciente r) {
		try{
			Persona pe = r.getPersona();
			pacienteDao.delete(r);
			personaDao.delete(pe);
		}catch(Exception e){}
	}

	public Paciente find(int id) {
		return pacienteDao.find(id);
	}

}
