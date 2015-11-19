package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FACTURA database table.
 * 
 */
@Entity
@NamedQuery(name="Factura.findAll", query="SELECT f FROM Factura f")
public class Factura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FACTURA_ID_GENERATOR", sequenceName="SEQ_FACTURA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FACTURA_ID_GENERATOR")
	private long id;

	private BigDecimal cita;

	private String credito;

	private BigDecimal cuotas;

	private String estado;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to DetalleFactua
	@OneToMany(mappedBy="factura")
	private List<DetalleFactua> detalleFactuas;

	//bi-directional many-to-one association to FormaFactura
	@OneToMany(mappedBy="factura")
	private List<FormaFactura> formaFacturas;

	//bi-directional many-to-one association to Movimiento
	@OneToMany(mappedBy="factura")
	private List<Movimiento> movimientos;

	//bi-directional many-to-one association to Pago
	@OneToMany(mappedBy="factura")
	private List<Pago> pagos;

	public Factura() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getCita() {
		return this.cita;
	}

	public void setCita(BigDecimal cita) {
		this.cita = cita;
	}

	public String getCredito() {
		return this.credito;
	}

	public void setCredito(String credito) {
		this.credito = credito;
	}

	public BigDecimal getCuotas() {
		return this.cuotas;
	}

	public void setCuotas(BigDecimal cuotas) {
		this.cuotas = cuotas;
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

	public List<DetalleFactua> getDetalleFactuas() {
		return this.detalleFactuas;
	}

	public void setDetalleFactuas(List<DetalleFactua> detalleFactuas) {
		this.detalleFactuas = detalleFactuas;
	}

	public DetalleFactua addDetalleFactua(DetalleFactua detalleFactua) {
		getDetalleFactuas().add(detalleFactua);
		detalleFactua.setFactura(this);

		return detalleFactua;
	}

	public DetalleFactua removeDetalleFactua(DetalleFactua detalleFactua) {
		getDetalleFactuas().remove(detalleFactua);
		detalleFactua.setFactura(null);

		return detalleFactua;
	}

	public List<FormaFactura> getFormaFacturas() {
		return this.formaFacturas;
	}

	public void setFormaFacturas(List<FormaFactura> formaFacturas) {
		this.formaFacturas = formaFacturas;
	}

	public FormaFactura addFormaFactura(FormaFactura formaFactura) {
		getFormaFacturas().add(formaFactura);
		formaFactura.setFactura(this);

		return formaFactura;
	}

	public FormaFactura removeFormaFactura(FormaFactura formaFactura) {
		getFormaFacturas().remove(formaFactura);
		formaFactura.setFactura(null);

		return formaFactura;
	}

	public List<Movimiento> getMovimientos() {
		return this.movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public Movimiento addMovimiento(Movimiento movimiento) {
		getMovimientos().add(movimiento);
		movimiento.setFactura(this);

		return movimiento;
	}

	public Movimiento removeMovimiento(Movimiento movimiento) {
		getMovimientos().remove(movimiento);
		movimiento.setFactura(null);

		return movimiento;
	}

	public List<Pago> getPagos() {
		return this.pagos;
	}

	public void setPagos(List<Pago> pagos) {
		this.pagos = pagos;
	}

	public Pago addPago(Pago pago) {
		getPagos().add(pago);
		pago.setFactura(this);

		return pago;
	}

	public Pago removePago(Pago pago) {
		getPagos().remove(pago);
		pago.setFactura(null);

		return pago;
	}

}