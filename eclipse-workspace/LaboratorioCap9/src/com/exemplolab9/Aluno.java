package com.exemplolab9;

public class Aluno extends Pessoa {
	private float mensalidade;
	private String curso;

	public Aluno(String nome, int idade, char sexo, int numeroRG, String dataNasc, float mensalidade, String curso) {
		super(nome, idade, sexo, new RG(numeroRG, dataNasc));
		this.mensalidade = mensalidade;
		this.curso = curso;
		
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;

	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void falar(String fala) {
		System.out.println(this.getNome() + ":" + fala);
	}

	public void mostrarDados() {
		System.out.println("\n--- Aluno: " + this.getNome() + " ---" + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo() + "\nMensalidade: " + this.getMensalidade() + "\nCurso: " + this.getCurso() + "\nNumero RG: " + this.getRg().getNumero() + "\nData de Nascimento: " + this.getRg().getDataNasc());
	}
}
