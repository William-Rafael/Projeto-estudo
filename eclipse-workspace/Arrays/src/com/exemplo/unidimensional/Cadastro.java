package com.exemplo.unidimensional;

public class Cadastro {

	public static void main(String[] args) {
		// praticar a instancia da classe pessoa a um array
		Pessoa pessoas[] = new Pessoa[2];
		//praticar a instancia da classe pessoa a um array
		pessoas[0] = new Pessoa();
		pessoas[0].altura = 1.68;
		pessoas[0].peso = 71.3;
		
		//criando um novo objeto
		pessoas[1] = new Pessoa();
		pessoas[1].altura = 1.81;
		pessoas[1].peso = 82.5;
		
		System.out.println(pessoas[0].altura);
		System.out.println(pessoas[0].peso);
		System.out.println("");
		System.out.println(pessoas[1].altura);
		System.out.println(pessoas[1].peso);

	}

}
