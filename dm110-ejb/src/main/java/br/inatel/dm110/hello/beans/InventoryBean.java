package br.inatel.dm110.hello.beans;


import br.inatel.dm110.hello.interfaces.InventoryRemote;
import br.inatel.dm110.hello.dao.CustomerDAO;
import br.inatel.dm110.hello.entities.*;
import br.inatel.dm110.hello.interfaces.InventoryLocal;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;


@Stateless
@Remote(InventoryRemote.class)
@Local(InventoryLocal.class)
public class InventoryBean implements InventoryLocal, InventoryRemote {

	@EJB
	private CustomerDAO productDAO;
	
	@Override
	public List<String> listProductNames() {
		// TODO Auto-generated method stub
		return productDAO.listAll().stream().map(Customer::getNome).collect(Collectors.toList());
	}

	@Override
	public void createNewCustomer(String name, String email, String endereco) {
		Customer product = new Customer();
		product.setNome(name);
		product.setEmail(email);
		product.setEndereco(endereco);
		productDAO.insert(product);
		
	}



}
