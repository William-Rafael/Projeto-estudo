package com.exemplo.contruargumentos;

public class Carro {
	// criar os atributos
	private String modelo;
	private int ano;
	
	// método construtor
	public Carro(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}
	
	//criar o método para exibir os valores
	public void mostrar() {
		System.out.println("O modelo do carro é " + modelo + " e o ano é " + ano + ".");
	}
}
