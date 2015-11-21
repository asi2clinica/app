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
import sv.edu.ufg.dao.SecretariaDao;

/**
 *
 * @author mauricio_calles
 */
@Service
@Transactional
public class SecretariaServiceImpl implements SecretariaService {

    @Autowired SecretariaDao secretariaDao;
    public void create(Object r) {
        secretariaDao.create(r);
    }

    public void update(Object r) {
        secretariaDao.update(r);
    }

    public void delete(Object r) {
        secretariaDao.delete(r);
    }

    public Object find(int id) {
        return secretariaDao.find(id);
    }

    public List<Object> findAll() {
        return secretariaDao.findAll();
    }
    
}
