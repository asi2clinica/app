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

import sv.edu.ufg.dao.PreclinicoDao;

/**
 *
 * @author Heraldo
 */

@Service
@Transactional
public class PreclinicoServiceImpl implements PreclinicoService {

	
	@Autowired PreclinicoDao PreclinicoDao;
	
	public void create(Object r) {
		PreclinicoDao.create(r);

	}

	public void update(Object r) {
		PreclinicoDao.update(r);

	}

	public void delete(Object r) {
		PreclinicoDao.delete(r);
	}

	public Object find(int id) {
		return PreclinicoDao.find(id);
	}

	public List<Object> findAll() {
		return PreclinicoDao.findAll();
	}

}