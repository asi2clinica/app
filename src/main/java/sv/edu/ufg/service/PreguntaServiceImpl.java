/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ufg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.edu.ufg.dao.PreguntaDao;

/**
 *
 * @author Heraldo
 */

@Service
@Transactional
public class PreguntaServiceImpl implements PreguntaService {

	
	@Autowired PreguntaDao preguntaDao;
	
	public void create(Object r) {
		preguntaDao.create(r);

	}

	public void update(Object r) {
		preguntaDao.update(r);

	}

	public void delete(Object r) {
		preguntaDao.delete(r);
	}

	public Object find(int id) {
		return preguntaDao.find(id);
	}

	public List<Object> findAll() {
		return preguntaDao.findAll();
	}

}
