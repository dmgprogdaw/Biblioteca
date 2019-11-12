package Biblioteca.inicio;

import Biblioteca.modelo.autores.CreateAutores;
import Biblioteca.modelo.ejemplares.CreateEjemplar;
import Biblioteca.modelo.libros.CreateLibros;
import Biblioteca.modelo.usuarios.CreateUsuario;
import Biblioteca.modelo.util.ConnectionEntityManagerFactory;
import Biblioteca.negocio.Autor;
import Biblioteca.negocio.Ejemplar;
import Biblioteca.negocio.Libro;
import Biblioteca.negocio.Usuario;

public class Start {

	public static void main(String[] args) {
		
		/**** INTRODUCIMOS LOS USUARIOS ****/
		Usuario david = new Usuario();
		david.setCodUsuario(1L);
		david.setNombre("David");
		david.setDireccion("Corigos");
		david.setTelefono("123456789");
		
		/**** INTRODUCIMOS LOS LIBROS ****/
		Libro ubelBlatt = new Libro();
		ubelBlatt.setCodLibro(1L);
		ubelBlatt.setNombre("Übel Blatt");
		ubelBlatt.setEditorial("Big Gangan");
		ubelBlatt.setIsbn("1252-2258-2223");
		ubelBlatt.setPaginas(448);
		
		/**** INTRODUCIMOS LOS EJEMPLARES ****/
		Ejemplar tomo1 = new Ejemplar();
		tomo1.setCodEjemplar(1L);
		tomo1.setLocalizacion("Japón");
		tomo1.setLibro(ubelBlatt);
	
		/**** INTRODUCIMOS LOS AUTORES****/
		Autor shionoEtorouji = new Autor();
		shionoEtorouji.setCodAutor(1L);
		shionoEtorouji.setNombre("Shiono Etorouji");
		
		/**** INTROSUCIMOS LOS DATOS EN LA LAS LISTAS****/
		shionoEtorouji.addLibros(ubelBlatt);
		
		
		/**** CREAMOS LOS USUARIOS****/
		CreateUsuario usuarios = new CreateUsuario();
		usuarios.create(david);
		
		/**** CREAMOS LOS AUTORES****/
		CreateAutores autores = new CreateAutores();
		autores.createLibro(shionoEtorouji);
		
		/**** CREAMOS LOS LIBROS****/
		CreateLibros libros = new CreateLibros();
		libros.createLibro(ubelBlatt);
		
		/**** CREAMOS LOS EJEMPLARES****/
		CreateEjemplar ejemplares = new CreateEjemplar();
		ejemplares.create(tomo1);
			
		
		ConnectionEntityManagerFactory.getEntityManagerFactory().close();
	}

}
