package Biblioteca.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

@Entity
@Table(name="usuarios", uniqueConstraints = @UniqueConstraint(columnNames = {"telefono"}))
public class Usuario {

	@Id
	@Column
	private long codUsuario;
	
	@Column
	private String nombre;
	
	@Column
	private String telefono;
	
	@Column
	private String direccion;
	
	@OneToMany
	private List<Sacar> extraccionesUsuario = new ArrayList<Sacar>();
	
	public void addExtraccion(Sacar extraccion) {
		
		if(!extraccionesUsuario.contains(extraccion)) {
			
			extraccionesUsuario.add(extraccion);
		}
	}	
	
	public List<Sacar> getExtracciones() {
		return extraccionesUsuario;
	}

	public void setExtracciones(List<Sacar> extraccionesUsuario) {
		this.extraccionesUsuario = extraccionesUsuario;
	}

	public long getCodUsuario() {
		return codUsuario;
	}


	public void setCodUsuario(long codUsuario) {
		this.codUsuario = codUsuario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
