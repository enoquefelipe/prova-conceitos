package com.conceito.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.conceito.model.Carro;
import com.conceito.util.JPAUtil;

/**
 * 
 * @author enoque.felipe.d.leal
 *
 */
public class CarroDao implements Serializable {

	private static final long serialVersionUID = 135158058296104905L;

	private EntityManager manager;

	public void cadastra(Carro carro) {
		try {
			manager = new JPAUtil().getEntityManager();
			manager.getTransaction().begin();
			manager.persist(carro);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public List<Carro> lista() {
		List<Carro> lista;
		try {
			manager = new JPAUtil().getEntityManager();
			Query query = manager.createQuery("select c from cars c");
			lista = query.getResultList();
			manager.close();
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
			return lista = null;
		}
	}

	public void remove(Carro carro) {
		try {
			manager = new JPAUtil().getEntityManager();
			manager.getTransaction().begin();
			manager.remove(carro);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removeMultiplos(List<Carro> carros) {
		try {
			for (Carro carro : carros) {
				manager = new JPAUtil().getEntityManager();
				manager.getTransaction().begin();
				Object object = manager.merge(carro);
				manager.remove(object);
				manager.getTransaction().commit();
				manager.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
