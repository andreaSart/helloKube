package com.example.helloMyDocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {

	@GetMapping(path = "world")
	public String sayHello() {
		return "hello world";
	}
}
