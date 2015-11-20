package sv.edu.ufg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.edu.ufg.dao.FacturaDao;
import sv.edu.ufg.model.Factura;

import java.util.List;


@Service
@Transactional
public class FacturaServiceImpl  implements FacturaService{

  
  	 @Autowired FacturaDao facturaDao;
  	 public void create(Factura arg0) {
        facturaDao.create(arg0);
  	 }

  
  	 public void delete(Factura arg0) {
        facturaDao.delete(arg0);
  	 }

  
  	 public Factura find(int arg0) {
        return facturaDao.find(arg0);
  	 }

  
    public List<Factura> findAll() {
        
        return facturaDao.findAll();
    }

  
    public void update(Factura arg0) {
        facturaDao.update(arg0);
    }
}
