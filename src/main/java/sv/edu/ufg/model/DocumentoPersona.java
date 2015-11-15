package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DOCUMENTO_PERSONA database table.
 * 
 */
@Entity
@Table(name="DOCUMENTO_PERSONA")
@NamedQuery(name="DocumentoPersona.findAll", query="SELECT d FROM DocumentoPersona d")
public class DocumentoPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DOCUMENTO_PERSONA_ID_GENERATOR", sequenceName="SEQ_DOCUMENTO_PERSONA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DOCUMENTO_PERSONA_ID_GENERATOR")
	private long id;

	//bi-directional many-to-one association to Persona
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PERSONA")
	private Persona persona;

	//bi-directional many-to-one association to TipoDocumento
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="TIPO_DOCUMENTO")
	private TipoDocumento tipoDocumento;

	public DocumentoPersona() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona personaBean) {
		this.persona = personaBean;
	}

	public TipoDocumento getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumentoBean) {
		this.tipoDocumento = tipoDocumentoBean;
	}

}