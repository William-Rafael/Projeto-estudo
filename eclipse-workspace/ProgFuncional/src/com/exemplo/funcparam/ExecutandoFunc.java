package com.exemplo.funcparam;

public class ExecutandoFunc {

	public static void main(String[] args) {
		// implementando o lambda
		/*ExemploFuncional5 calculo = recebedor -> {
			double temporaria = recebedor * 4;
			return temporaria;
		};
		double resultado = calculo.quadruplo(6);
		System.out.println("Resultado do calculo: " + resultado);*/

		//segundo exemplo 
		ExemploFuncional5 calculo = recebedor -> recebedor *4;
		System.out.println("Resultado do calculo: " + calculo.quadruplo(25));
	}

}
