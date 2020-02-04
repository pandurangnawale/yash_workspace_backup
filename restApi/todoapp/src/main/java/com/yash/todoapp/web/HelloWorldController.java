package com.yash.todoapp.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yash.todoapp.model.HelloWorldBean;

//Controller
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {
	
	//when ever we are creating restful webservice we need to define two things
	//1.What method you are going to use //Get method
	//2.What URI you are going to use//hello-world
	// method:"HelloWord"
//	@RequestMapping(method =RequestMethod.GET,path="/hello-world")
	@GetMapping(path="/hello-world")
	public String helloworld() {
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloworldbean() {		
		return  new HelloWorldBean("Data From BackEnd Using Rest Services ");
	}
	

	//hello-world/path-variable/sunil
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloworldPathvariable(@PathVariable String name) {
		return  new HelloWorldBean(String.format("Hello world, %s", name));
	}
}
