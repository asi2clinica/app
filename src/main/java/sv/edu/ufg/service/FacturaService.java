package sv.edu.ufg.service;

import java.util.List;
import sv.edu.ufg.model.Factura;

public interface FacturaService {
  	public void create(Factura r);
	public void update(Factura r);
	public void delete(Factura r);
	public Factura find(int id);
	public List<Factura> findAll();
}
