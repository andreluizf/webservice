package br.com.axis2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerHelper {

	private static EntityManager em;

	public static EntityManager getEntityManager() {
		if (em == null) {
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("CardValidationPU");

			em = emf.createEntityManager();
		}
		return em;
	}

}
