package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SECRETARIA database table.
 * 
 */
@Entity
@NamedQuery(name="Secretaria.findAll", query="SELECT s FROM Secretaria s")
public class Secretaria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SECRETARIA_ID_GENERATOR", sequenceName="SEQ_SECRETARIA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SECRETARIA_ID_GENERATOR")
	private long id;

	private String direccion;

	private String estado;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_NACIMIENTO")
	private Date fechaNacimiento;

	private String nombre;

	private String telefono;

	//bi-directional many-to-one association to Cita
	@OneToMany(mappedBy="secretaria")
	private List<Cita> citas;

	public Secretaria() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Cita> getCitas() {
		return this.citas;
	}

	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}

	public Cita addCita(Cita cita) {
		getCitas().add(cita);
		cita.setSecretaria(this);

		return cita;
	}

	public Cita removeCita(Cita cita) {
		getCitas().remove(cita);
		cita.setSecretaria(null);

		return cita;
	}

}