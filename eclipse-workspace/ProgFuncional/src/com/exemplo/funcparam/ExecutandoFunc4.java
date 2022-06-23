package com.exemplo.funcparam;

public class ExecutandoFunc4 {

	public static void main(String[] args) {
		// uso do lambda composto
		ExemploFuncional4 novosDados = (nome, idade, salario) -> {
			String nomeMaiusculo = nome.toUpperCase();
			if(idade < 18) {
				System.out.println("O colaborador não pode ter menos de 18 anos.");
			}else {
				System.out.println("O colaborador " + nomeMaiusculo + "recebe o salario " + salario);
			}
		};
		novosDados.exibeDados("Sr. Batata ", 58, 6500.21);

	}

}
