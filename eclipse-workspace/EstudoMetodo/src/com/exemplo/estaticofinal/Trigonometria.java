package com.exemplo.estaticofinal;

public class Trigonometria {
	//declarando o m�todo estatico com o modificador final
	public static final double PI = 3.1415;
	
	
	// criando o m�todo principal
	
	public static void main(String args[]) {
		double raio = 2.5;
		//uma variavel para receber a opera��o
		double perimetro = 2 * raio * PI;
		
		
		// exibindo o resultado da opera��o
		
		System.out.printf("o valor do perimetro �: %.2f", perimetro);
		
	}

}
