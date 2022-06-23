package com.exemplo.heranca;

public class Dev extends Funcionario{
	
	// criar as especificidades da classe
	private String linguagemProgramacao;
	private String sistemaOperacional;
	double salario;
	
	//contrutores
	//contrutor padrao
	
	public Dev() {}
	//contrutor customizado
	public Dev(String n, String e, String linguagem, String so) {
		//acessar as propriedades - as herdadas e as descritas e inicializa-las
		nome = n;
		email = e;
		this.linguagemProgramacao = linguagem;
		this.sistemaOperacional = so;
	}
	//metodos acessores
	public String getLinguagem() {
		return linguagemProgramacao;
	}
	public void setLinguagem(String linguagem) {
		this.linguagemProgramacao = linguagem;
	}
	
	public String sistemaOperacional() {
		return sistemaOperacional;
	}
	public void setSistemaOperacional(String so) {
		this.sistemaOperacional = so;
	}
	
	//metodo para exibicao do conteudo
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("linguagem de programacao: " + linguagemProgramacao);
		System.out.println("Sistema Operacional: " + sistemaOperacional);
	}

}
