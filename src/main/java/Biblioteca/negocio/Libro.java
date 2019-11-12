package Biblioteca.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name="libros", uniqueConstraints = @UniqueConstraint(columnNames = {"isbn"}))
public class Libro {

	@Id
	@Column
	private long codLibro;
	
	@Column
	private String nombre; 
	
	@Column
	private String isbn;
	
	@Column
	private String editorial;
	
	@Column
	private int paginas;
	
	@ManyToMany
	private List<Autor> autores = new ArrayList<Autor>();
	
	@OneToMany(mappedBy="libro")
	private List<Ejemplar> ejemplarLibro = new ArrayList<Ejemplar>();
	
	public void addEjemplarLibro(Ejemplar ejemplar) {
		
		if(!ejemplarLibro.contains(ejemplar)) {
			
			ejemplarLibro.add(ejemplar);
		}
	}
	
	public void addAutor(Autor autor) {
		
		if(!autores.contains(autor)) {
			
			autores.add(autor);
			autor.addLibros(this);
		}
	}

	public List<Ejemplar> getEjemplarLibro() {
		return ejemplarLibro;
	}

	public void setEjemplarLibro(List<Ejemplar> ejemplarLibro) {
		this.ejemplarLibro = ejemplarLibro;
	}

	public List<Autor> getAutores() {
		return autores;
	}

	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}

	public long getCodLibro() {
		return codLibro;
	}

	public void setCodLibro(long codLibro) {
		this.codLibro = codLibro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
}
