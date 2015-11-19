package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CITA database table.
 * 
 */
@Entity
@NamedQuery(name="Cita.findAll", query="SELECT c FROM Cita c")
public class Cita implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CITA_ID_GENERATOR", sequenceName="SEQ_CITA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CITA_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_PROGRAMACION_CITA")
	private Date fechaProgramacionCita;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_REGISTRO")
	private Date fechaRegistro;

	//bi-directional many-to-one association to Doctor
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_DOCTOR")
	private Doctor doctor;

	//bi-directional many-to-one association to EstadosCita
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ESTADO_CITA")
	private EstadosCita estadosCita;

	//bi-directional many-to-one association to Horario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_HORARIO")
	private Horario horario;

	//bi-directional many-to-one association to Paciente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_PACIENTE")
	private Paciente paciente;

	//bi-directional many-to-one association to Secretaria
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_SECRETARIA_REGISTRO")
	private Secretaria secretaria;

	//bi-directional many-to-one association to Servicio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_SERVICIO")
	private Servicio servicio;

	//bi-directional many-to-one association to Sucursal
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_SUCURSAL")
	private Sucursal sucursal;

	public Cita() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFechaProgramacionCita() {
		return this.fechaProgramacionCita;
	}

	public void setFechaProgramacionCita(Date fechaProgramacionCita) {
		this.fechaProgramacionCita = fechaProgramacionCita;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public EstadosCita getEstadosCita() {
		return this.estadosCita;
	}

	public void setEstadosCita(EstadosCita estadosCita) {
		this.estadosCita = estadosCita;
	}

	public Horario getHorario() {
		return this.horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Paciente getPaciente() {
		return this.paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Secretaria getSecretaria() {
		return this.secretaria;
	}

	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}

	public Servicio getServicio() {
		return this.servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Sucursal getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

}