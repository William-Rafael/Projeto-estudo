package com.exemplo.sobrecarga;

public class SobrecargaMetodo {
	// m�todos sobrecarregados
	
	static void mostrar(int valor) {
		//exibir o valor dados paramentro
		System.out.println("O valor oferecido �: " + valor);
	}
	
	static void mostrar(String nome) {
		System.out.println("valor oferecido �: " + nome);
	}
	
	static void mostrar() {
		System.out.println("sem valores e sem parametros!");
	}
	
}
