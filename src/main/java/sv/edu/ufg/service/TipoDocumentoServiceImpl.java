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
import sv.edu.ufg.dao.TipoDocumentoDao;
import sv.edu.ufg.model.TipoDocumento;
/**
 *
 * @author Daniel
 */
@Service
@Transactional
public class TipoDocumentoServiceImpl implements  TipoDocumentoService{

   @Autowired TipoDocumentoDao tipodocumentoDao;
	public void create(TipoDocumento r) {
		tipodocumentoDao.create(r);
	}

	public void update(TipoDocumento r) {
		tipodocumentoDao.update(r);
	}

	public void delete(TipoDocumento r) {
		tipodocumentoDao.delete(r);
	}

	public TipoDocumento find(int id) {
		return tipodocumentoDao.find(id);
	}

	public List<TipoDocumento> findAll() {
		return tipodocumentoDao.findAll();
	}
    
}
