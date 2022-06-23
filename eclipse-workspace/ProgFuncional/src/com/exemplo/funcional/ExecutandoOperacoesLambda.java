package com.exemplo.funcional;

public class ExecutandoOperacoesLambda {
	public static void main(String [] args) {
		//implementar a operacao de soma
		OperacaoAritmetica novaSoma = (param1, param2) -> param1 + param2; //uso da expressao lambda
		
		// executando a operacao de soma
		double total = novaSoma.execute(8.9, 9.8);
		
		//exibindo o resultado
		System.out.println("o valor da operacao é: " + total);
	}

}
