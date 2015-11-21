package sv.edu.ufg.service;

import java.util.List;

import sv.edu.ufg.model.FormaPago;

public interface FormaService {
	public void create(FormaPago r);
	public void update(FormaPago r);
	public void delete(FormaPago r);
	public FormaPago find(int id);
	public List<FormaPago> findAll();
}
