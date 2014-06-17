package wss;

import javax.jws.WebService;

@WebService 
public interface SpringService {

	String sayHello(String name);
}
