package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloRestController {

	@GetMapping()
	public String HelloWorld(@RequestParam String name) {
		return "Hello, " + name;
	}
}
