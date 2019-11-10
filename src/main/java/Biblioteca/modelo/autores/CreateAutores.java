package Biblioteca.modelo.autores;

import javax.persistence.EntityManager;

import Biblioteca.modelo.util.ConnectionEntityManagerFactory;
import Biblioteca.negocio.Autor;

public class CreateAutores {

public void createLibro(Autor autor) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(autor);
		entityManager.getTransaction().commit();
	}
}
