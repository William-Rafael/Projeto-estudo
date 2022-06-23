package com.exemplo.varargs;

public class CriandoMetodoVars {
	//criando o primeiro metodo de argunto variavel
	public int calcular(int[] lista) {
		int soma = 0;
		
		// criando o loop para iterar sobre o paramentro
		
		for(int i = 0; i < lista.length; i++) {
			soma += lista[i];
		}
		return soma;
	}
	
	//criando o segundo metodo
	public int contar(int ...lista) {
		int soma = 0;
		//estabelecendo loop
		for(int i: lista) {
			soma += i;
		}
		return soma;
	}

}
