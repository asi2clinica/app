package sv.edu.ufg.dao;


import sv.edu.ufg.model.Factura;
import java.util.List;

public interface FacturaDao {
  	public void create(Factura r);
	public void update(Factura r);
	public void delete(Factura r);
	public Factura find(int id);
	public List<Factura> findAll();
}
