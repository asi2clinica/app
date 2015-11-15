package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PRODUCTO_PRECIO database table.
 * 
 */
@Entity
@Table(name="PRODUCTO_PRECIO")
@NamedQuery(name="ProductoPrecio.findAll", query="SELECT p FROM ProductoPrecio p")
public class ProductoPrecio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PRODUCTO_PRECIO_ID_GENERATOR", sequenceName="SEQ_PRODUCTO_PRECIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCTO_PRECIO_ID_GENERATOR")
	private long id;

	private String activo;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private BigDecimal precio;

	//bi-directional many-to-one association to Existencia
	@OneToMany(mappedBy="productoPrecio")
	private List<Existencia> existencias;

	//bi-directional many-to-one association to Movimiento
	@OneToMany(mappedBy="productoPrecio")
	private List<Movimiento> movimientos;

	//bi-directional many-to-one association to Producto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_PRODUCTO")
	private Producto producto;

	public ProductoPrecio() {
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

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public List<Existencia> getExistencias() {
		return this.existencias;
	}

	public void setExistencias(List<Existencia> existencias) {
		this.existencias = existencias;
	}

	public Existencia addExistencia(Existencia existencia) {
		getExistencias().add(existencia);
		existencia.setProductoPrecio(this);

		return existencia;
	}

	public Existencia removeExistencia(Existencia existencia) {
		getExistencias().remove(existencia);
		existencia.setProductoPrecio(null);

		return existencia;
	}

	public List<Movimiento> getMovimientos() {
		return this.movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public Movimiento addMovimiento(Movimiento movimiento) {
		getMovimientos().add(movimiento);
		movimiento.setProductoPrecio(this);

		return movimiento;
	}

	public Movimiento removeMovimiento(Movimiento movimiento) {
		getMovimientos().remove(movimiento);
		movimiento.setProductoPrecio(null);

		return movimiento;
	}

	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}