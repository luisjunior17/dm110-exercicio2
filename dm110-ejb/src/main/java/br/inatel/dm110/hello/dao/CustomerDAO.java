package br.inatel.dm110.hello.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.dm110.hello.entities.Customer;

@Stateless
public class CustomerDAO {
	@PersistenceContext(unitName = "inventory")
	private EntityManager em;

	public List<Customer> listAll()
	{
		return em.createQuery("from Product p",Customer.class).getResultList();
		
	}
	
	public void insert(Customer product) {
		em.persist(product);
	}
}