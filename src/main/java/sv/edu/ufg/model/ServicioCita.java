package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SERVICIO_CITA database table.
 * 
 */
@Entity
@Table(name="SERVICIO_CITA")
@NamedQuery(name="ServicioCita.findAll", query="SELECT s FROM ServicioCita s")
public class ServicioCita implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SERVICIO_CITA_ID_GENERATOR", sequenceName="SEQ_SERVICIO_CITA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SERVICIO_CITA_ID_GENERATOR")
	private long id;

	//bi-directional many-to-one association to Cita
	@ManyToOne
	@JoinColumn(name="ID_CITA")
	private Cita cita;

	//bi-directional many-to-one association to Servicio
	@ManyToOne
	@JoinColumn(name="ID_SERVICIO")
	private Servicio servicio;

	public ServicioCita() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cita getCita() {
		return this.cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	public Servicio getServicio() {
		return this.servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

}