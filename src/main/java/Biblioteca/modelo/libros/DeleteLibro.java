package Biblioteca.modelo.libros;

import javax.persistence.EntityManager;

import Biblioteca.modelo.util.ConnectionEntityManagerFactory;
import Biblioteca.negocio.Libro;

public class DeleteLibro {

	
	public void delete(Libro libro) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		Libro borrarLibro = entityManager.find(Libro.class, libro.getCodLibro());
		entityManager.remove(borrarLibro);
		entityManager.getTransaction().commit();
	}
}
