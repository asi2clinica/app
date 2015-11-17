/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.ufg.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Heraldo
 */
@Entity
@NamedQuery(name="Preclinico.findAll", query="SELECT p FROM Preclinico p")
public class Preclinico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PRECLINICO_ID_GENERATOR", sequenceName="SEQ_PRECLINICO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRECLINICO_ID_GENERATOR")
	private int id;
        private int paciente;
        private int pregunta;
        private String respuesta;
	
        public Preclinico() {
	}
        
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPaciente() {
		return this.paciente;
	}

	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}
        
        public int getPregunta() {
		return this.pregunta;
	}

	public void setPregunta(int pregunta) {
		this.pregunta = pregunta;
	}
        
        public String getRespuesta() {
		return this.respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
}