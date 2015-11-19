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
@NamedQuery(name="Pregunta.findAll", query="SELECT p FROM Pregunta p")
public class Pregunta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PREGUNTA_ID_GENERATOR", sequenceName="SEQ_PREGUNTA")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PREGUNTA_ID_GENERATOR")
	private int id;
        private String descripcion;
	
        public Pregunta() {
	}
        
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
        
        
}