package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FORMA_FACTURA database table.
 * 
 */
@Entity
@Table(name="FORMA_FACTURA")
@NamedQuery(name="FormaFactura.findAll", query="SELECT f FROM FormaFactura f")
public class FormaFactura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FORMA_FACTURA_ID_GENERATOR", sequenceName="SEQ_FORMA_FACTURA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FORMA_FACTURA_ID_GENERATOR")
	private long id;

	private BigDecimal monto;

	//bi-directional many-to-one association to Factura
	@ManyToOne(fetch=FetchType.LAZY)
	private Factura factura;

	//bi-directional many-to-one association to FormaPago
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FORMA_PAGO_ID")
	private FormaPago formaPago;

	public FormaFactura() {
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

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public FormaPago getFormaPago() {
		return this.formaPago;
	}

	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}

}