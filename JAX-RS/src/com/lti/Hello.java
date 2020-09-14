package com.lti;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")   //this is resource containing data and our business logic
public class Hello {
	@GET
	@Produces(MediaType.TEXT_PLAIN)   //this is business logic
	public String sayPlainTextHello() {
		return "Hello jersey Plain";		//our data	
	}
	
	 // This method is called if HTML is requested  
	  @GET  
	  @Produces(MediaType.TEXT_HTML)  
	  public String sayHtmlHello() {  
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"  
	        + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html> ";  
	  }  

	// This method is called if XML is requested  
	  @GET  
	  @Produces(MediaType.TEXT_XML)  
	  public String sayXMLHello() {  
	    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";  
	  }  
	  
	 
}
