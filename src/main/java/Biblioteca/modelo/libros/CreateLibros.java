package Biblioteca.modelo.libros;

import javax.persistence.EntityManager;

import Biblioteca.modelo.util.ConnectionEntityManagerFactory;
import Biblioteca.negocio.Libro;

public class CreateLibros {

	
	public void createLibro(Libro libro) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(libro);
		entityManager.getTransaction().commit();
	}
}
