package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the EXISTENCIA database table.
 * 
 */
@Entity
@NamedQuery(name="Existencia.findAll", query="SELECT e FROM Existencia e")
public class Existencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EXISTENCIA_ID_GENERATOR", sequenceName="SEQ_EXISTENCIA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EXISTENCIA_ID_GENERATOR")
	private long id;

	private BigDecimal existencia;

	//bi-directional many-to-one association to Producto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_PRODUCTO")
	private Producto producto;

	//bi-directional many-to-one association to ProductoPrecio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_PRODUCTO_PRECIO")
	private ProductoPrecio productoPrecio;

	//bi-directional many-to-one association to Sucursal
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_SUCURSAL")
	private Sucursal sucursal;

	public Existencia() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getExistencia() {
		return this.existencia;
	}

	public void setExistencia(BigDecimal existencia) {
		this.existencia = existencia;
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

	public Sucursal getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

}