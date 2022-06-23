package com.exemplo.funcparam;

public class ExecutandoFunc3 {

	public static void main(String[] args) {
		// uso de expressao lambda sem parenteses
		ExemploFuncional3 funcao = elemento -> Math.sqrt(elemento);
		
		double resultado = funcao.oMetodo(144);
		System.out.println("Resultado: " + resultado);
		

	}

}
