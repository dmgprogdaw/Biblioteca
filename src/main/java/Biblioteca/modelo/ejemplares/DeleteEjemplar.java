package Biblioteca.modelo.ejemplares;

import Biblioteca.modelo.util.ConnectionEntityManagerFactory;
import Biblioteca.negocio.Ejemplar;
import javax.persistence.EntityManager;

public class DeleteEjemplar {

	
	public void delete(Ejemplar ejemplar) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		Ejemplar borrarEjemplar = entityManager.find(Ejemplar.class, ejemplar.getCodEjemplar());
		entityManager.remove(borrarEjemplar);
		entityManager.getTransaction().commit();
	}
}
