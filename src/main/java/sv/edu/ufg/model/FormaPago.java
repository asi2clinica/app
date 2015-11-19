package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FORMA_PAGO database table.
 * 
 */
@Entity
@Table(name="FORMA_PAGO")
@NamedQuery(name="FormaPago.findAll", query="SELECT f FROM FormaPago f")
public class FormaPago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FORMA_PAGO_ID_GENERATOR", sequenceName="SEQ_FORMA_PAGO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FORMA_PAGO_ID_GENERATOR")
	private long id;

	private String activo;

	private String descipcion;

	//bi-directional many-to-one association to FormaFactura
	@OneToMany(mappedBy="formaPago")
	private List<FormaFactura> formaFacturas;

	//bi-directional many-to-one association to FormaPagoCuota
	@OneToMany(mappedBy="formaPago")
	private List<FormaPagoCuota> formaPagoCuotas;

	public FormaPago() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getDescipcion() {
		return this.descipcion;
	}

	public void setDescipcion(String descipcion) {
		this.descipcion = descipcion;
	}

	public List<FormaFactura> getFormaFacturas() {
		return this.formaFacturas;
	}

	public void setFormaFacturas(List<FormaFactura> formaFacturas) {
		this.formaFacturas = formaFacturas;
	}

	public FormaFactura addFormaFactura(FormaFactura formaFactura) {
		getFormaFacturas().add(formaFactura);
		formaFactura.setFormaPago(this);

		return formaFactura;
	}

	public FormaFactura removeFormaFactura(FormaFactura formaFactura) {
		getFormaFacturas().remove(formaFactura);
		formaFactura.setFormaPago(null);

		return formaFactura;
	}

	public List<FormaPagoCuota> getFormaPagoCuotas() {
		return this.formaPagoCuotas;
	}

	public void setFormaPagoCuotas(List<FormaPagoCuota> formaPagoCuotas) {
		this.formaPagoCuotas = formaPagoCuotas;
	}

	public FormaPagoCuota addFormaPagoCuota(FormaPagoCuota formaPagoCuota) {
		getFormaPagoCuotas().add(formaPagoCuota);
		formaPagoCuota.setFormaPago(this);

		return formaPagoCuota;
	}

	public FormaPagoCuota removeFormaPagoCuota(FormaPagoCuota formaPagoCuota) {
		getFormaPagoCuotas().remove(formaPagoCuota);
		formaPagoCuota.setFormaPago(null);

		return formaPagoCuota;
	}

}