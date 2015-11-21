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
import sv.edu.ufg.dao.EstadoCitaDao;

/**
 *
 * @author mauricio_calles
 */
@Service
@Transactional
public class EstadoCitaServiceImpl implements EstadoCitaService {

    @Autowired
    EstadoCitaDao estadoCitaDao;

    public void create(Object r) {
        estadoCitaDao.create(r);
    }

    public void update(Object r) {
        estadoCitaDao.update(r);
    }

    public void delete(Object r) {
        estadoCitaDao.delete(r);
    }

    public Object find(int id) {
        return estadoCitaDao.find(id);
    }

    public List<Object> findAll() {
        return estadoCitaDao.findAll();
    }

}
