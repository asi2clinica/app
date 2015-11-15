package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the USUARIO database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	private String activo;

	private String clave;

	@Column(name="EMPLEADO_PERSONA")
	private BigDecimal empleadoPersona;
	
	@Id
	private String usuario;

	public Usuario() {
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public BigDecimal getEmpleadoPersona() {
		return this.empleadoPersona;
	}

	public void setEmpleadoPersona(BigDecimal empleadoPersona) {
		this.empleadoPersona = empleadoPersona;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}