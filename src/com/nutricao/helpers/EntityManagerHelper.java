package com.nutricao.helpers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerHelper {

	private static EntityManager em;

	public static EntityManager getEntityManager() {
		try {
			if (em == null) {
				EntityManagerFactory emf = Persistence
						.createEntityManagerFactory("CardValidationPU");

				em = emf.createEntityManager();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return em;
	}

} 