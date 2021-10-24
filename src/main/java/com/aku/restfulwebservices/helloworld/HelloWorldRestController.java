package com.aku.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String helloWorld() {
		return "Hello Akash!!!";
	}
	
	@GetMapping(path = "/helloBean")
	public HelloWorld helloWorldBean() {
		return new HelloWorld("Akash");
	}
	
	@GetMapping(path = "/helloBean/pathVariable/{name}")
	public HelloWorld helloWorldBeanPathVariable(@PathVariable String name) {
		return new HelloWorld(String.format("Hello India, %s", name));
	}

}
