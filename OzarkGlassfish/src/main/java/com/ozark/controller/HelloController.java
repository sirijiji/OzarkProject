package com.ozark.controller;

import javax.inject.Inject;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.ozark.model.HelloWorld;

@Controller
@Path("hello")
public class HelloController {
	
	@Inject
	private HelloWorld helloWorld;

	
	@GET
	public String hello(){
		
		helloWorld.setMessage("hello world");
		
		return "/view/hello.jsp";
	}
}
