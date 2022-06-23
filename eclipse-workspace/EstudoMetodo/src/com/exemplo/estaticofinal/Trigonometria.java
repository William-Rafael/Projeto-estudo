package com.exemplo.estaticofinal;

public class Trigonometria {
	//declarando o método estatico com o modificador final
	public static final double PI = 3.1415;
	
	
	// criando o método principal
	
	public static void main(String args[]) {
		double raio = 2.5;
		//uma variavel para receber a operação
		double perimetro = 2 * raio * PI;
		
		
		// exibindo o resultado da operação
		
		System.out.printf("o valor do perimetro é: %.2f", perimetro);
		
	}

}
