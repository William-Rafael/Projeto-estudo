package com.exemplo.funcparam;

public class ExecutandoFunc1 {

	public static void main(String[] args) {
		// utilizando de expressao lambda
		
		ExemploFuncional1 dados = (nome, idade, salario) -> System.out.println("Parab�ns " + nome.toUpperCase() + "\npelos seus " + idade + "\nanos de vida.Seu novo salario �: " + salario);

		dados.exibeDados("coisinha ", 40 , 5500.23);
	}

}
