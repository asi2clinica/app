package sv.edu.ufg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.edu.ufg.dao.UsuarioRolDao;

@Service
@Transactional
public class UsuarioRolServiceImpl implements UsuarioRolService {

	@Autowired UsuarioRolDao usuarioRolDao;
	
	
	public void create(Object r) {
		usuarioRolDao.create(r);
	}

	public void update(Object r) {
		usuarioRolDao.update(r);
	}

	public void delete(Object r) {
		usuarioRolDao.delete(r);

	}

	public Object find(int id) {
		return usuarioRolDao.find(id);
	}

	public List<Object> findAll() {
		return usuarioRolDao.findAll();
	}

}
