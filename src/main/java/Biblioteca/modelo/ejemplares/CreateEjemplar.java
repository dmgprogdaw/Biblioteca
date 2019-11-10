package Biblioteca.modelo.ejemplares;

import Biblioteca.modelo.util.ConnectionEntityManagerFactory;
import Biblioteca.negocio.Ejemplar;
import javax.persistence.EntityManager;

public class CreateEjemplar {

	
	public void create(Ejemplar ejemplar) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(ejemplar);
		entityManager.getTransaction().commit();
	}
}
