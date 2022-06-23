package com.exemplo.sobrecarga;

public class SobrecargaMetodo {
	// métodos sobrecarregados
	
	static void mostrar(int valor) {
		//exibir o valor dados paramentro
		System.out.println("O valor oferecido é: " + valor);
	}
	
	static void mostrar(String nome) {
		System.out.println("valor oferecido é: " + nome);
	}
	
	static void mostrar() {
		System.out.println("sem valores e sem parametros!");
	}
	
}
