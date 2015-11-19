package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TELEFONO database table.
 * 
 */
@Entity
@NamedQuery(name="Telefono.findAll", query="SELECT t FROM Telefono t")
public class Telefono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TELEFONO_ID_GENERATOR", sequenceName="SEQ_TELEFONO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TELEFONO_ID_GENERATOR")
	private long id;

	private String telefono;

	//bi-directional many-to-one association to Persona
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="PERSONA")
	private Persona persona;

	public Telefono() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona personaBean) {
		this.persona = personaBean;
	}

}