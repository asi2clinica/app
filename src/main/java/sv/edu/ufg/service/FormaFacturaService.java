package sv.edu.ufg.service;

import java.util.List;

import sv.edu.ufg.model.FormaFactura;

public interface FormaFacturaService {
	public void create(FormaFactura r);
	public void update(FormaFactura r);
	public void delete(FormaFactura r);
	public FormaFactura find(int id);
	public List<FormaFactura> findAll();
}
