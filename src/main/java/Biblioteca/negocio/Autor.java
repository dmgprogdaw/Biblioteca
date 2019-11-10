package Biblioteca.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Column;

@Entity
@Table(name="autores")
public class Autor {

	@Id
	@Column
	private long codAutor;
	
	@Column
	private String nombre;

	public long getCodAutor() {
		return codAutor;
	}

	public void setCodAutor(long codAutor) {
		this.codAutor = codAutor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
