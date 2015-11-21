/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sv.edu.ufg.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import sv.edu.ufg.model.Doctor;

/**
 *
 * @author mauricio_calles
 */
@Repository
public class DoctorDaoImpl extends GenericDaoImpl implements DoctorDao {
    
    public Object find(int id) {
		return getSession().get(Doctor.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Object> findAll() {
		return getSession().createCriteria(Doctor.class).list();
	}
}
