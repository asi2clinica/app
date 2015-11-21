package sv.edu.ufg.dao;

import java.util.List;
import sv.edu.ufg.model.DetalleFactua;

public interface DetalleFacturaDao {
	public void create(DetalleFactua r);
	public void update(DetalleFactua r);
	public void delete(DetalleFactua r);
	public DetalleFactua find(int id);
	public List<DetalleFactua> findAll();
}
