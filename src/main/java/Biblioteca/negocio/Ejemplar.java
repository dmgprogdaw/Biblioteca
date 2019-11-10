package Biblioteca.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Column;

@Entity
@Table(name="ejemplares")
public class Ejemplar {

	@Id
	@Column
	private long codEjemplar;
	
	@Column
	private String localizacion;

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
