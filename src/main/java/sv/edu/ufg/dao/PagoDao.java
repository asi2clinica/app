package sv.edu.ufg.dao;

import java.util.List;
import sv.edu.ufg.model.Pago;

public interface PagoDao {
  	public void create(Pago r);
	public void update(Pago r);
	public void delete(Pago r);
	public Pago find(int id);
	public List<Pago> findAll();
}
