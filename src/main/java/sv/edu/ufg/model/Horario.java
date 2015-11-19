package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the HORARIO database table.
 * 
 */
@Entity
@NamedQuery(name="Horario.findAll", query="SELECT h FROM Horario h")
public class Horario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HORARIO_ID_GENERATOR", sequenceName="SEQ_HORARIO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HORARIO_ID_GENERATOR")
	private long id;

	private String estado;

	private String nombre;

	@Column(name="RANGO_HORA")
	private String rangoHora;

	//bi-directional many-to-one association to Cita
	@OneToMany(mappedBy="horario")
	private List<Cita> citas;

	public Horario() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
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

	public String getRangoHora() {
		return this.rangoHora;
	}

	public void setRangoHora(String rangoHora) {
		this.rangoHora = rangoHora;
	}

	public List<Cita> getCitas() {
		return this.citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public Cita addCita(Cita cita) {
		getCitas().add(cita);
		cita.setHorario(this);

		return cita;
	}

	public Cita removeCita(Cita cita) {
		getCitas().remove(cita);
		cita.setHorario(null);

		return cita;
	}

}