package br.inatel.dm110.hello.beans;

import br.inatel.dm110.hello.interfaces.Hello;
import br.inatel.dm110.hello.interfaces.HelloLocal;
import br.inatel.dm110.hello.interfaces.HelloRemote;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;


@Stateless
@Remote(HelloRemote.class)
@Local(HelloLocal.class)
public class HelloBean implements HelloLocal, HelloRemote {

	@Override
	public String sayHello(String name) {
		System.out.println("inside EJB!");
		// TODO Auto-generated method stub
		return "Hello" + name +" from ejb !!!";
	}

}
