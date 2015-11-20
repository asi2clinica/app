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
	private long id;

	private String estado;

	private String nombre;

	private BigDecimal precio;

	//bi-directional many-to-one association to ServicioCita
	@OneToMany(mappedBy="servicio", fetch=FetchType.EAGER)
	private List<ServicioCita> servicioCitas;

	public Servicio() {
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

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public List<ServicioCita> getServicioCitas() {
		return this.servicioCitas;
	}

	public void setServicioCitas(List<ServicioCita> servicioCitas) {
		this.servicioCitas = servicioCitas;
	}

	public ServicioCita addServicioCita(ServicioCita servicioCita) {
		getServicioCitas().add(servicioCita);
		servicioCita.setServicio(this);

		return servicioCita;
	}

	public ServicioCita removeServicioCita(ServicioCita servicioCita) {
		getServicioCitas().remove(servicioCita);
		servicioCita.setServicio(null);

		return servicioCita;
	}

}