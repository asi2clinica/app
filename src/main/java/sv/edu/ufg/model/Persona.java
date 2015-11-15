package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PERSONA database table.
 * 
 */
@Entity
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PERSONA_ID_GENERATOR", sequenceName="SEQ_PERSONA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERSONA_ID_GENERATOR")
	private long id;

	private String apellido;

	private String direccion;

	private String email;

	@Temporal(TemporalType.DATE)
	private Date fnacimiento;

	@Temporal(TemporalType.DATE)
	private Date fregistro;

	private String genero;

	private String nombre;

	//bi-directional many-to-one association to DocumentoPersona
	@OneToMany(mappedBy="persona")
	private List<DocumentoPersona> documentoPersonas;

	//bi-directional many-to-one association to Paciente
	@OneToMany(mappedBy="persona")
	private List<Paciente> pacientes;

	//bi-directional many-to-one association to Telefono
	@OneToMany(mappedBy="persona")
	private List<Telefono> telefonos;

	public Persona() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFnacimiento() {
		return this.fnacimiento;
	}

	public void setFnacimiento(Date fnacimiento) {
		this.fnacimiento = fnacimiento;
	}

	public Date getFregistro() {
		return this.fregistro;
	}

	public void setFregistro(Date fregistro) {
		this.fregistro = fregistro;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<DocumentoPersona> getDocumentoPersonas() {
		return this.documentoPersonas;
	}

	public void setDocumentoPersonas(List<DocumentoPersona> documentoPersonas) {
		this.documentoPersonas = documentoPersonas;
	}

	public DocumentoPersona addDocumentoPersona(DocumentoPersona documentoPersona) {
		getDocumentoPersonas().add(documentoPersona);
		documentoPersona.setPersona(this);

		return documentoPersona;
	}

	public DocumentoPersona removeDocumentoPersona(DocumentoPersona documentoPersona) {
		getDocumentoPersonas().remove(documentoPersona);
		documentoPersona.setPersona(null);

		return documentoPersona;
	}

	public List<Paciente> getPacientes() {
		return this.pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public Paciente addPaciente(Paciente paciente) {
		getPacientes().add(paciente);
		paciente.setPersona(this);

		return paciente;
	}

	public Paciente removePaciente(Paciente paciente) {
		getPacientes().remove(paciente);
		paciente.setPersona(null);

		return paciente;
	}

	public List<Telefono> getTelefonos() {
		return this.telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public Telefono addTelefono(Telefono telefono) {
		getTelefonos().add(telefono);
		telefono.setPersona(this);

		return telefono;
	}

	public Telefono removeTelefono(Telefono telefono) {
		getTelefonos().remove(telefono);
		telefono.setPersona(null);

		return telefono;
	}

}