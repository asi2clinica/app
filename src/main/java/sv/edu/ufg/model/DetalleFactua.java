package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DETALLE_FACTUA database table.
 * 
 */
@Entity
@Table(name="DETALLE_FACTUA")
@NamedQuery(name="DetalleFactua.findAll", query="SELECT d FROM DetalleFactua d")
public class DetalleFactua implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DETALLE_FACTUA_ID_GENERATOR", sequenceName="SEQ_DETALLE_FACTUA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DETALLE_FACTUA_ID_GENERATOR")
	private long id;

	private BigDecimal cantidad;

	@Column(name="PODUCTO_ID")
	private BigDecimal poductoId;

	private BigDecimal precio;

	//bi-directional many-to-one association to Factura
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="FACURA_ID")
	private Factura factura;

	public DetalleFactua() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPoductoId() {
		return this.poductoId;
	}

	public void setPoductoId(BigDecimal poductoId) {
		this.poductoId = poductoId;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

}