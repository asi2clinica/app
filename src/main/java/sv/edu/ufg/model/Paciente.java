package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PACIENTE database table.
 * 
 */
@Entity
@NamedQuery(name="Paciente.findAll", query="SELECT p FROM Paciente p")
public class Paciente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PACIENTE_ID_GENERATOR", sequenceName="SEQ_PACIENTE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PACIENTE_ID_GENERATOR")
	private int id;

	
	@OneToMany(mappedBy="paciente")
	private List<Cita> citas;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="PERSONA")
	private Persona persona;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="TIPO_PACIENTE")
	private TipoPaciente tipoPaciente;

	public Paciente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Cita> getCitas() {
		return this.citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public Cita addCita(Cita cita) {
		getCitas().add(cita);
		cita.setPaciente(this);

		return cita;
	}

	public Cita removeCita(Cita cita) {
		getCitas().remove(cita);
		cita.setPaciente(null);

		return cita;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public TipoPaciente getTipoPaciente() {
		return this.tipoPaciente;
	}

	public void setTipoPaciente(TipoPaciente tipoPaciente) {
		this.tipoPaciente = tipoPaciente;
	}

}