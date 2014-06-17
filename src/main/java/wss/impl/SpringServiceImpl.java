package wss.impl;

import javax.jws.WebService;

import wss.SpringService;

@WebService(targetNamespace = "http://wss/",endpointInterface = "wss.SpringService")
public class SpringServiceImpl implements SpringService {

	public String sayHello(String name) {
		return "Hello" + name;
	}

}
