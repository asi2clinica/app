package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the SERVICIO database table.
 * 
 */
@Entity
@NamedQuery(name="Servicio.findAll", query="SELECT s FROM Servicio s")
public class Servicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SERVICIO_ID_GENERATOR", sequenceName="SEQ_SERVICIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SERVICIO_ID_GENERATOR")
	private int id;

	private String estado;

	private String nombre;

	private BigDecimal precio;

	//bi-directional many-to-one association to Cita
	@OneToMany(mappedBy="servicio")
	private List<Cita> citas;

	public Servicio() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public List<Cita> getCitas() {
		return this.citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public Cita addCita(Cita cita) {
		getCitas().add(cita);
		cita.setServicio(this);

		return cita;
	}

	public Cita removeCita(Cita cita) {
		getCitas().remove(cita);
		cita.setServicio(null);

		return cita;
	}

}