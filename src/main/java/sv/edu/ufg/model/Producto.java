package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PRODUCTO database table.
 * 
 */
@Entity
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PRODUCTO_ID_GENERATOR", sequenceName="SEQ_PRODUCTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCTO_ID_GENERATOR")
	private long id;

	private String activo;

	@Column(name="COD_PRODUCTO")
	private String codProducto;

	private String nombre;

	//bi-directional many-to-one association to Existencia
	@OneToMany(mappedBy="producto")
	private List<Existencia> existencias;

	//bi-directional many-to-one association to Movimiento
	@OneToMany(mappedBy="producto")
	private List<Movimiento> movimientos;

	//bi-directional many-to-one association to ProductoPrecio
	@OneToMany(mappedBy="producto")
	private List<ProductoPrecio> productoPrecios;

	public Producto() {
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

	public String getCodProducto() {
		return this.codProducto;
	}

	public void setCodProducto(String codProducto) {
		this.codProducto = codProducto;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Existencia> getExistencias() {
		return this.existencias;
	}

	public void setExistencias(List<Existencia> existencias) {
		this.existencias = existencias;
	}

	public Existencia addExistencia(Existencia existencia) {
		getExistencias().add(existencia);
		existencia.setProducto(this);

		return existencia;
	}

	public Existencia removeExistencia(Existencia existencia) {
		getExistencias().remove(existencia);
		existencia.setProducto(null);

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
		movimiento.setProducto(this);

		return movimiento;
	}

	public Movimiento removeMovimiento(Movimiento movimiento) {
		getMovimientos().remove(movimiento);
		movimiento.setProducto(null);

		return movimiento;
	}

	public List<ProductoPrecio> getProductoPrecios() {
		return this.productoPrecios;
	}

	public void setProductoPrecios(List<ProductoPrecio> productoPrecios) {
		this.productoPrecios = productoPrecios;
	}

	public ProductoPrecio addProductoPrecio(ProductoPrecio productoPrecio) {
		getProductoPrecios().add(productoPrecio);
		productoPrecio.setProducto(this);

		return productoPrecio;
	}

	public ProductoPrecio removeProductoPrecio(ProductoPrecio productoPrecio) {
		getProductoPrecios().remove(productoPrecio);
		productoPrecio.setProducto(null);

		return productoPrecio;
	}

}