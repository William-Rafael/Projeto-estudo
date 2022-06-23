package com.exemplo.varargs;

public class ChamandoMetodosVarArgs {

	public static void main(String args[]) {
		// chamando o primeiro metodo de argumentos variaveis
		int resultado;
		int intArray[] = {90, -67, 456, 789, 71, 34, 21};
		
		//instanciando a classe
		CriandoMetodoVars metodos = new CriandoMetodoVars();
		
		resultado = metodos.calcular(intArray);
		// exibindo
		
		System.out.println("Resultado: " + resultado);
		
		//chamando o segundo metodo
		resultado = metodos.contar(90, -67, 456, 12, 71, 23, 21);
		// exibindo a soma dos valores do segundo metodo
		
				System.out.println("Resultado: " + resultado);

	}

}
