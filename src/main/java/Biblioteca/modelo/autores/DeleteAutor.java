package Biblioteca.modelo.autores;

import javax.persistence.EntityManager;

import Biblioteca.modelo.util.ConnectionEntityManagerFactory;
import Biblioteca.negocio.Autor;

public class DeleteAutor {

	
	public void delete(Autor autor) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		Autor borrarAutor = entityManager.find(Autor.class, autor.getCodAutor());
		entityManager.remove(borrarAutor);
		entityManager.getTransaction().commit();
	}
}
