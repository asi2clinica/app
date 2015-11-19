package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the TIPO_PACIENTE database table.
 * 
 */
@Entity
@Table(name="TIPO_PACIENTE")
@NamedQuery(name="TipoPaciente.findAll", query="SELECT t FROM TipoPaciente t")
public class TipoPaciente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPO_PACIENTE_ID_GENERATOR", sequenceName="SEQ_TIPO_PACIENTE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPO_PACIENTE_ID_GENERATOR")
	private int id;

	private String activo;

	private String tipo;

	//bi-directional many-to-one association to Paciente
	@OneToMany(mappedBy="tipoPaciente") @JsonIgnore
	private List<Paciente> pacientes;

	public TipoPaciente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Paciente> getPacientes() {
		return this.pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public Paciente addPaciente(Paciente paciente) {
		getPacientes().add(paciente);
		paciente.setTipoPaciente(this);

		return paciente;
	}

	public Paciente removePaciente(Paciente paciente) {
		getPacientes().remove(paciente);
		paciente.setTipoPaciente(null);

		return paciente;
	}

}