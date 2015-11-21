package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TIPO_DOCUMENTO database table.
 * 
 */
@Entity
@Table(name="TIPO_DOCUMENTO")
@NamedQuery(name="TipoDocumento.findAll", query="SELECT t FROM TipoDocumento t")
public class TipoDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPO_DOCUMENTO_ID_GENERATOR", sequenceName="SEQ_TIPO_DOCUMENTO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPO_DOCUMENTO_ID_GENERATOR")
	private int  id;

	private String activo;

	private String documento;

	//bi-directional many-to-one association to DocumentoPersona
	@OneToMany(mappedBy="tipoDocumento")
	private List<DocumentoPersona> documentoPersonas;

	public TipoDocumento() {
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

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public List<DocumentoPersona> getDocumentoPersonas() {
		return this.documentoPersonas;
	}

	public void setDocumentoPersonas(List<DocumentoPersona> documentoPersonas) {
		this.documentoPersonas = documentoPersonas;
	}

	public DocumentoPersona addDocumentoPersona(DocumentoPersona documentoPersona) {
		getDocumentoPersonas().add(documentoPersona);
		documentoPersona.setTipoDocumento(this);

		return documentoPersona;
	}

	public DocumentoPersona removeDocumentoPersona(DocumentoPersona documentoPersona) {
		getDocumentoPersonas().remove(documentoPersona);
		documentoPersona.setTipoDocumento(null);

		return documentoPersona;
	}

    

}