package Biblioteca.negocio;

import java.util.ArrayList;
import java.util.List;
import Biblioteca.negocio.Libro;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="autores")
public class Autor {

	@Id
	@Column
	private long codAutor;
	
	@Column
	private String nombre;
	
	@ManyToMany(mappedBy="autores")
	private List<Libro> libros = new ArrayList<Libro>();
	
	public void addLibros(Libro libro) {
		
		if(!libros.contains(libro)) {
			
			libros.add(libro);
			libro.addAutor(this);
		}
	}	

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

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
