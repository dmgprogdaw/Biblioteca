package Biblioteca.modelo.sacar;

import javax.persistence.EntityManager;

import Biblioteca.modelo.util.ConnectionEntityManagerFactory;
import Biblioteca.negocio.Sacar;

public class CreateSacar {

	
	public void createExtracciones(Sacar sacar) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(sacar);
		entityManager.getTransaction().commit();
	}
}
