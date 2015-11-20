package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FORMA_PAGO_CUOTA database table.
 * 
 */
@Entity
@Table(name="FORMA_PAGO_CUOTA")
@NamedQuery(name="FormaPagoCuota.findAll", query="SELECT f FROM FormaPagoCuota f")
public class FormaPagoCuota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FORMA_PAGO_CUOTA_ID_GENERATOR", sequenceName="SEQ_FORMA_PAGO_CUOTA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FORMA_PAGO_CUOTA_ID_GENERATOR")
	private long id;

	private BigDecimal monto;

	//bi-directional many-to-one association to FormaPago
	@ManyToOne
	@JoinColumn(name="FORMA_PAGO_ID")
	private FormaPago formaPago;

	//bi-directional many-to-one association to Pago
	@ManyToOne
	@JoinColumn(name="PAGOS_ID")
	private Pago pago;

	public FormaPagoCuota() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getMonto() {
		return this.monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public FormaPago getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}

	public Pago getPago() {
		return this.pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

}