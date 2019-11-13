package Biblioteca.negocio;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ejemplares")
public class Ejemplar {

	@Id
	@Column
	private long codEjemplar;
	
	@Column
	private String localizacion;
	
	@ManyToOne
	@JoinColumn(name="libro")
	private Libro libro;
	
	@OneToMany
	private List<Sacar> extracciones = new ArrayList<Sacar>();
	
	public void addExtraccion(Sacar extraccion) {
		
		if(!extracciones.contains(extraccion)) {
			
			extracciones.add(extraccion);
		}
	}	
	
	public List<Sacar> getExtracciones() {
		return extracciones;
	}

	public void setExtracciones(List<Sacar> extracciones) {
		this.extracciones = extracciones;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public long getCodEjemplar() {
		return codEjemplar;
	}

	public void setCodEjemplar(long codEjemplar) {
		this.codEjemplar = codEjemplar;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	
	
}
