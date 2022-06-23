package com.extensao.metodo;

public class PassagemDeValor {

	public static void main(String[] args) {
		// criar uma variavel para observar a alteração de valores com chamada de um metodo
		int valor = 1500;
		//tentativa de alterar o valor
		System.out.println("Antes da chamada do metodo alterarValor - o valor é: " + valor);
		
		//aqui, abaixo, sera chamado o metodo alterar valor
		System.out.println("Depois da chamada do metodo alterarValor - o valor é: " +valor);
		System.out.println("---------------------------------\n");
		
		//uma instancia da classe pessoa()
		Pessoa maria = new Pessoa();
		maria.nome = "Maria";
		maria.idade = 26;
		maria.genero= 'f';
		System.out.println("---------------------------------\n");
		
		//tentativa de alterar valor a referencia do objeto
		System.out.println("valores antes da chamada do metodo alterarRefObj:");
		maria.exibirDados();
		//chamada do metodo alterarRefObj
		alterarRefObj(maria);
		
		System.out.println("Valores depois da chamada do metodo alterarRefObj");
		maria.exibirDados();
		
		//tentativa de de alterar CONTEUDO do objeto Maria
		System.out.println("conteudo/valores antes da chamada do metodo alterarContObj");
		maria.exibirDados();
		//chamada do metodo alterarContObls
		alterarContObj(maria);
		System.out.println("conteudo/valores depois da chamada do metodo alterarContObj");
		maria.exibirDados();
		
		System.out.println("---------------------------------\n");
		
	}
		
		//contruindo os metodos para serem referenciados
		static void alterarValor(int valor) {
			// atribuindo um novo valor alterando
			valor = 137;
		}
		
		static void alterarRefObj(Pessoa p) {
			Pessoa ana = new Pessoa();
			ana.nome = "Ana";
			ana.idade = 23;
			ana.genero = 'F';
			p = ana;
		}
		static void alterarContObj(Pessoa p) {
			p.idade = 95;
			p.genero = 'M';
			
		}
	}



