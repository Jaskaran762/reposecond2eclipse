package com.lti;

import java.net.URI;  
import javax.ws.rs.client.Client;  
import javax.ws.rs.client.ClientBuilder;  
import javax.ws.rs.client.WebTarget;  
import javax.ws.rs.core.MediaType;  
import javax.ws.rs.core.UriBuilder;  
import org.glassfish.jersey.client.ClientConfig;  

public class ClientTest {  
  public static void main(String[] args) {  
	
    ClientConfig config = new ClientConfig();  
    Client client = ClientBuilder.newClient(config); 
    
    WebTarget target = client.target(getBaseURI());  
    
    //Now printing the server code of different media type  
    System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class)); 
    System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class));  
    System.out.println(target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class));  
  }  
  
  private static URI getBaseURI() {  
    //here server is running on 9191 port number and project name is JAX-RS 
    return UriBuilder.fromUri("http://localhost:9191/JAX-RS").build();  
  }  
}   