package com.exemplo.metodo;

public class Calculadora {
	//criando um metodo para a execução de uma operação
	
    public int somar(int valor1, int valor2) {
    	//indicar uma variavel para que receba a soma dos valores dos paramentros
    	int resultado;
    	
    	// estabelecendo a operacao
    	resultado = valor1 + valor2;
    	
    	//implementando a expressao de retorno
    	
    	return resultado;
    	
    }
 // vamos criar as outras 3 operacoes aritimeticas - subtracao, multiplicacao e divisao
 	public int subtrair(int valor1, int valor2) {
 		//indicar a variavel para que receba a subtracao dos valores dos paramentros
 		int resultado;
 		
 		//estabelecendo a operação
 		resultado = valor1 - valor2;
 		
 		//implementando a expressao de retorno
 		return resultado;
 	}
 	
 	public int multiplicar(int valor1, int valor2) {
 		//indicar a variavel para que receba a multiplicacao
 		int resultado;
 		
 		//estabelecendo a operação
 		resultado = valor1 * valor2;
 		
 		//implementando a expressao de retorno
 		return resultado;
 	}
 	
 	public float divisao(float valor1, float valor2) {
 		//indicar a variavel para que receba a divisao
 		float resultado;
 		
 		//estabelecendo a operação
 		resultado = valor1 / valor2;
 		
 		//implementando a expressao de retorno
 		return resultado;
 	
 	}
}
