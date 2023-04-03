package com.ravi.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Deployment {
	@GetMapping("/deploy")
	public String deployment() {
		return "Deployment Program";

	}
}
