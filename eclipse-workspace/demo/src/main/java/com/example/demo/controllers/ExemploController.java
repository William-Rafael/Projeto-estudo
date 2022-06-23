package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// utilizando annotations
@RestController
@RequestMapping("/api/exemplo")
public class ExemploController {

	// indicar uma resposta para quando a api for devidamente chamada

	@GetMapping("/ola-mundo")
	// criar metodo
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Ola Mundo Spring MVC/Boot");
	}

}
