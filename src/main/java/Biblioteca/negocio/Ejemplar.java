package Biblioteca.negocio;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
