package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the SUCURSAL database table.
 * 
 */
@Entity
@NamedQuery(name="Sucursal.findAll", query="SELECT s FROM Sucursal s")
public class Sucursal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SUCURSAL_ID_GENERATOR", sequenceName="SEQ_SUCURSAL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SUCURSAL_ID_GENERATOR")
	private long id;

	private String direccion;

	private String email;

	private String estado;

	private String nombre;

	private String telefono;

	//bi-directional many-to-one association to Cita
	@OneToMany(mappedBy="sucursal")
	private List<Cita> citas;

	//bi-directional many-to-one association to Existencia
	@OneToMany(mappedBy="sucursal")
	private List<Existencia> existencias;

	public Sucursal() {
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		cita.setSucursal(this);

		return cita;
	}

	public Cita removeCita(Cita cita) {
		getCitas().remove(cita);
		cita.setSucursal(null);

		return cita;
	}

	public List<Existencia> getExistencias() {
		return this.existencias;
	}

	public void setExistencias(List<Existencia> existencias) {
		this.existencias = existencias;
	}

	public Existencia addExistencia(Existencia existencia) {
		getExistencias().add(existencia);
		existencia.setSucursal(this);

		return existencia;
	}

	public Existencia removeExistencia(Existencia existencia) {
		getExistencias().remove(existencia);
		existencia.setSucursal(null);

		return existencia;
	}

}