package com.exemplo.funcional;

public class ExecutandoOperacoes {
	//instruindo o metodo principal
	public static void main(String[] args) {
		//instanciar a classe soma
		OperacaoAritmetica somando = new Soma();
		
		// fazer o uso do objeto para operar com a soma de valores
		double resultado = somando.execute(15.9, 9.4);
		
		//exibir o valor da variavel resultado
		System.out.println("O resultado da operacao é: " + resultado);
		
	}

}
