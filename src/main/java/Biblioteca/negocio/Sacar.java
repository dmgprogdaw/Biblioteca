package Biblioteca.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

@Entity
@Table(name="sacarEjemplares")
public class Sacar implements Serializable {
	
	@Id
	@Column
	private String fechaPrestamo;
	
	@Column
	private String fechaDevolucion;
	
	@Id
	@ManyToOne
	private Usuario usuario;
	
	@Id
	@ManyToOne
	private Ejemplar ejemplar;

	public String getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public String getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Ejemplar getEjemplar() {
		return ejemplar;
	}

	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}
	
	
	
}
