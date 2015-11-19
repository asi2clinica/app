package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MOVIMIENTO database table.
 * 
 */
@Entity
@NamedQuery(name="Movimiento.findAll", query="SELECT m FROM Movimiento m")
public class Movimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MOVIMIENTO_ID_GENERATOR", sequenceName="SEQ_MOVIMIENTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MOVIMIENTO_ID_GENERATOR")
	private long id;

	private BigDecimal cantidad;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="TIPO_MOVIMIENTO")
	private String tipoMovimiento;

	//bi-directional many-to-one association to Factura
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_FACTURA")
	private Factura factura;

	//bi-directional many-to-one association to Producto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_PRODUCTO")
	private Producto producto;

	//bi-directional many-to-one association to ProductoPrecio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_PRODUCTO_PRECIO")
	private ProductoPrecio productoPrecio;

	public Movimiento() {
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

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipoMovimiento() {
		return this.tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public ProductoPrecio getProductoPrecio() {
		return this.productoPrecio;
	}

	public void setProductoPrecio(ProductoPrecio productoPrecio) {
		this.productoPrecio = productoPrecio;
	}

}