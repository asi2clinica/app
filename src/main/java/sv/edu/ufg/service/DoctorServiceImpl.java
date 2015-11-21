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
import sv.edu.ufg.dao.DoctorDao;

/**
 *
 * @author mauricio_calles
 */
@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {

    @Autowired DoctorDao doctorDao;
    public void create(Object r) {
        doctorDao.create(r);
    }

    public void update(Object r) {
        doctorDao.update(r);
    }

    public void delete(Object r) {
        doctorDao.delete(r);
    }

    public Object find(int id) {
        return doctorDao.find(id);
    }

    public List<Object> findAll() {
        return doctorDao.findAll();
    }
    
}
