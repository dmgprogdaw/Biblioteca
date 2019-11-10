package Biblioteca.modelo.usuarios;

import javax.persistence.EntityManager;
import Biblioteca.modelo.util.ConnectionEntityManagerFactory;
import Biblioteca.negocio.Usuario;

public class DeleteUsuario {

	
	public void delete(Usuario usuario) {
		
		EntityManager entityManager = ConnectionEntityManagerFactory.getEntityManagerFactory().createEntityManager();
		
		entityManager.getTransaction().begin();
		Usuario borrarUsuario = entityManager.find(Usuario.class, usuario.getCodUsuario());
		entityManager.remove(borrarUsuario);
		entityManager.getTransaction().commit();
	}	
	
}
