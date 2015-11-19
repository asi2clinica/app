package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ROL_USUARIO database table.
 * 
 */
@Entity
@Table(name="ROL_USUARIO")
@NamedQuery(name="RolUsuario.findAll", query="SELECT r FROM RolUsuario r")
public class RolUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RolUsuarioPK id;

	@ManyToOne(fetch=FetchType.LAZY)
	private Rol rol;

	public RolUsuario() {
	}

	public RolUsuarioPK getId() {
		return this.id;
	}

	public void setId(RolUsuarioPK id) {
		this.id = id;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}