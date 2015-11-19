package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ESTADOS_CITA database table.
 * 
 */
@Entity
@Table(name="ESTADOS_CITA")
@NamedQuery(name="EstadosCita.findAll", query="SELECT e FROM EstadosCita e")
public class EstadosCita implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ESTADOS_CITA_ID_GENERATOR", sequenceName="SEQ_ESTADOS_CITA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ESTADOS_CITA_ID_GENERATOR")
	private long id;

	private String descripcion;

	private String nombre;

	//bi-directional many-to-one association to Cita
	@OneToMany(mappedBy="estadosCita")
	private List<Cita> citas;

	public EstadosCita() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cita> getCitas() {
		return this.citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public Cita addCita(Cita cita) {
		getCitas().add(cita);
		cita.setEstadosCita(this);

		return cita;
	}

	public Cita removeCita(Cita cita) {
		getCitas().remove(cita);
		cita.setEstadosCita(null);

		return cita;
	}

}