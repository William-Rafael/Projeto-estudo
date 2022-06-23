package com.exemplo.funcional;

//classe que implementa a interface
public class Soma implements OperacaoAritmetica{
	//implementando o metodo descrito na interface operacaoAritmetica
	public double execute(double valor1, double valor2) {
		//implementar uma operacao aritmetica
		double resultado = valor1 + valor2;
		return resultado;
		
	}
}
