package br.inatel.dm110.hello.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.dm110.hello.api.HelloService;
import br.inatel.dm110.hello.api.Result;
import br.inatel.dm110.hello.interfaces.HelloRemote;

@RequestScoped
public class HelloServiceImpl implements HelloService{

	@EJB(lookup="java:app/dm110-ejb-0.1-SNAPSHOT/HelloBean!br.inatel.dm110.hello.interfaces.HelloRemote")
	private HelloRemote hello;
	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		String message = hello.sayHello(name);
		return "<h1>Hello " + message + "!!!</h1>";
	}

	@Override
	public Result message(String firstName, String last) {
		// TODO Auto-generated method stub
		Result result = new Result();
		result.setFirstName(firstName);
		result.setLastName(last);
		String message =  String.format("Hello %s %s!!", firstName, last);
		result.setMessage(message);
		return result;
	}

}
