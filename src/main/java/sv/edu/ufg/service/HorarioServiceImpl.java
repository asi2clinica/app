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
import sv.edu.ufg.dao.HorarioDao;

/**
 *
 * @author mauricio_calles
 */
@Service
@Transactional
public class HorarioServiceImpl implements HorarioService {

    @Autowired HorarioDao horarioDao;
    public void create(Object r) {
        horarioDao.create(r);
    }

    public void update(Object r) {
        horarioDao.update(r);
    }

    public void delete(Object r) {
        horarioDao.delete(r);
    }

    public Object find(int id) {
        return horarioDao.find(id);
    }

    public List<Object> findAll() {
        return horarioDao.findAll();
    }
    
}
