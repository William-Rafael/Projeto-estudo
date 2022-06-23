package com.example.novosaudar.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.novosaudar.model.Saudacao;

@RestController
public class SaudacaoController {
	//definindo dois atributos
	private static final String valorPadrao = "Ola, %s!";
	private final AtomicLong contador = new AtomicLong();
	
	@RequestMapping("/saudacao")
	public Saudacao saudar(
			@RequestParam(value = "nome", defaultValue = "Mundo") String nome) {
		return new Saudacao(contador.incrementAndGet(), String.format(valorPadrao, nome));
		
		
	}
}
