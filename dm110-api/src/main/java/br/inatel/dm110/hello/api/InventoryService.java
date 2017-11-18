package br.inatel.dm110.hello.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/inventory")
public interface InventoryService {
	
	@GET
	@Path("/products/names")
	@Produces(MediaType.APPLICATION_JSON)
	List<String> listAllCustomer();
	
	@POST
	//@Path("/products/{name}")
	//@Produces(MediaType.APPLICATION_JSON)	
	void createNewCustomer(@PathParam("name") String name,@PathParam("email") String email,@PathParam("endereco") String endereco);
	
}
