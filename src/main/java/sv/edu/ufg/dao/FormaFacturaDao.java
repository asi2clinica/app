package sv.edu.ufg.dao;

import java.util.List;
import sv.edu.ufg.model.FormaFactura;

public interface FormaFacturaDao {
	public void create(FormaFactura r);
	public void update(FormaFactura r);
	public void delete(FormaFactura r);
	public FormaFactura find(int id);
	public List<FormaFactura> findAll();
}
