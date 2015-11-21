package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PAGOS database table.
 * 
 */
@Entity
@Table(name="PAGOS")
@NamedQuery(name="Pago.findAll", query="SELECT p FROM Pago p")
public class Pago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PAGOS_ID_GENERATOR", sequenceName="SEQ_PAGOS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PAGOS_ID_GENERATOR")
	private long id;

	private String estado;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_VENCIMIENTO")
	private Date fechaVencimiento;

	private BigDecimal monto;

	private BigDecimal penalizacion;

	//bi-directional many-to-one association to FormaPagoCuota
	@OneToMany(mappedBy="pago")
	private List<FormaPagoCuota> formaPagoCuotas;

	//bi-directional many-to-one association to Factura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FACURA_ID")
	private Factura factura;

	public Pago() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public BigDecimal getMonto() {
		return this.monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public BigDecimal getPenalizacion() {
		return this.penalizacion;
	}

	public void setPenalizacion(BigDecimal penalizacion) {
		this.penalizacion = penalizacion;
	}

	public List<FormaPagoCuota> getFormaPagoCuotas() {
		return this.formaPagoCuotas;
	}

	public void setFormaPagoCuotas(List<FormaPagoCuota> formaPagoCuotas) {
		this.formaPagoCuotas = formaPagoCuotas;
	}

	public FormaPagoCuota addFormaPagoCuota(FormaPagoCuota formaPagoCuota) {
		getFormaPagoCuotas().add(formaPagoCuota);
		formaPagoCuota.setPago(this);

		return formaPagoCuota;
	}

	public FormaPagoCuota removeFormaPagoCuota(FormaPagoCuota formaPagoCuota) {
		getFormaPagoCuotas().remove(formaPagoCuota);
		formaPagoCuota.setPago(null);

		return formaPagoCuota;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

}