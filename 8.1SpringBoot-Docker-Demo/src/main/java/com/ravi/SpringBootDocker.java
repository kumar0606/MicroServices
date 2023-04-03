package com.ravi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootDocker {
@GetMapping("/dock")
	public String Docker() {
		return "Welcome To Docker Project";
		
	}
}
