package br.inatel.dm110.hello.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.dm110.hello.api.InventoryService;
import br.inatel.dm110.hello.interfaces.InventoryRemote;

@RequestScoped
public class InventoryServiceImpl implements InventoryService {
	@EJB(lookup="java:app/dm110-ejb-0.1-SNAPSHOT/InventoryBean!br.inatel.dm110.hello.interfaces.InventoryRemote")
	private InventoryRemote inventoryBean;

	@Override
	public List<String> listAllCustomer() {
		// TODO Auto-generated method stub
		return inventoryBean.listCustomerNames();
	}

	@Override
	public void createNewCustomer(String name, String email, String endereco) {
		inventoryBean.createNewCustomer(name, email, endereco);
		
	}
	
}
