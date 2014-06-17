package service.test;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import wss.SpringService;


public class ServiceTest {

	public static void main(String[] args) throws Exception {
		
		JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
		Client client = clientFactory.createClient("http://localhost:8080/webservice/services/wss?wsdl");
		Object[] result = client.invoke("sayHello", "jo");
		System.out.println(result[0]);

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(SpringService.class);
        factory.setAddress("http://localhost:8080/webservice/services/wss?wsdl");
        
        SpringService service = (SpringService) factory.create();
        System.out.println("[result]" + service.sayHello("jo"));
	}

}
