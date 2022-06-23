package com.exemplo.heranca;

public class Funcionario {
	// definir abritutos da classe
	protected String nome;
	protected String email;
	int idade;
	char genero;
	
	//contrutores
	//estabelecendo um contrutor padrao
	public Funcionario() {}
	
	//contrutor customizado
	public Funcionario(String nome, String email) {
		this.nome = nome;
		this.email = email;
		
		
	}

}
