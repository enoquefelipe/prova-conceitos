package com.conceito.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory manager = Persistence.createEntityManagerFactory("carros");

	public EntityManager getEntityManager() {
		return manager.createEntityManager();
	}

	public void close(EntityManager em) {
		em.close();
	}

}
