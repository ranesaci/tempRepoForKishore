package com.sachin.springboottest.controller;

import java.rmi.RemoteException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import soap.test.MyClassProxy;


/**
* @author sachin
* @date 23-Sep-2021
*/

@RestController
public class TestController {
	/*
	 * @GetMapping("test") public String testGetMethod() { return "Hello Sachin!!!";
	 * }
	 */

	@GetMapping("test")
	public String testGetMethod1() throws RemoteException {
		
		/*
		 * Axis2HelloWorld str = null; Axis2HelloWorldService service = new
		 * Axis2HelloWorldServiceLocator(); try { str = service.getAxis2HelloWorld(); }
		 * catch (ServiceException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
	//	Axis2HelloWorldSoapBindingStub stub = new Axis2HelloWorldSoapBindingStub();
		
	
	  MyClassProxy proxy = new MyClassProxy();
	  System.out.println(proxy.getData());
	  
	  return "Hello Sachin123!!!"+ proxy.getData();
	 
		 
		 
		 
		//return "erew";
	}

}


