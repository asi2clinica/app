package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ROL_USUARIO database table.
 * 
 */
@Embeddable
public class RolUsuarioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ROL_ID", insertable=false, updatable=false)
	private long rolId;

	private String usuario;

	public RolUsuarioPK() {
	}
	public long getRolId() {
		return this.rolId;
	}
	public void setRolId(long rolId) {
		this.rolId = rolId;
	}
	public String getUsuario() {
		return this.usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RolUsuarioPK)) {
			return false;
		}
		RolUsuarioPK castOther = (RolUsuarioPK)other;
		return 
			(this.rolId == castOther.rolId)
			&& this.usuario.equals(castOther.usuario);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.rolId ^ (this.rolId >>> 32)));
		hash = hash * prime + this.usuario.hashCode();
		
		return hash;
	}
}