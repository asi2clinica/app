package sv.edu.ufg.dao;

import java.util.List;

import sv.edu.ufg.model.FormaPagoCuota;

public interface FormaPagoCuotaDao {
  	public void create(FormaPagoCuota r);
	public void update(FormaPagoCuota r);
	public void delete(FormaPagoCuota r);
	public FormaPagoCuota find(int id);
	public List<FormaPagoCuota> findAll();
}
