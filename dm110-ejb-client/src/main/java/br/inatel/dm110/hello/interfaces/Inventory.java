package br.inatel.dm110.hello.interfaces;

import java.util.List;
public interface Inventory {

	List<String> listCustomerNames();
	void createNewCustomer(String name, String email, String endereco);
	
}
