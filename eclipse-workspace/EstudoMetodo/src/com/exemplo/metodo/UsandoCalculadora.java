package com.exemplo.metodo;

public class UsandoCalculadora {

	public static void main(String[] args) {
		// criar uma variavel para chamar o objeto da instancia e acessar o metodo de somar()
		
		int somando; //variavel simples, definida
		int subtraindo; //variavel para operacao de subtracao
		int multiplicando;
		float dividindo;
		
		//instanciando a classe calculadora()
		Calculadora calc = new Calculadora();
		
		//fazer o uso do objeto calc e acessar o metodo somar()
		
		somando = calc.somar(12, 60);
		
		//fazer uso do objeto calc e acessar o metodo subtrair
		subtraindo = calc.subtrair(60, 12);
		
		//exibir a soma
		
		multiplicando = calc.multiplicar(2, 2);
		
		dividindo = calc.divisao(59, 12);
		
		System.out.println("Somando - total: " + somando);
		System.out.println("Subtraindo - total: " + subtraindo);
		System.out.println("Multiplicação - total: " + multiplicando);
		//System.out.println("divisão - total: " + dividindo);
		System.out.format(String.format("dividindo - total: %.2f ",dividindo));
		//System.out.printf("Dividindo %.2f", dividindo);

		}
	
	
	}


