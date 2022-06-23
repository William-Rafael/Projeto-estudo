package com.exemplolab9;

public class Professor extends Pessoa {
	private float salario;
	private String disciplina;

	public Professor(String nome, int idade, char sexo, int numero, String dataNasc, float salario, String disciplina) {
		super(nome, idade, sexo, new RG(numero, dataNasc));
		this.salario = salario;
		this.disciplina = disciplina;

	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;

	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;

	}

	public void falar(String fala) {
		System.out.println(this.getNome() + ":" + fala);
	}

	public void mostrarDados() {
		System.out.println("\n---Professor: " + this.getNome() + " ---" + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo() + "\nSalario: " + this.getSalario() +"\nDisciplina: " + this.getDisciplina() + "\nNumero RG: " + this.getRg().getNumero() + "\nData de Nascimento: " + this.getRg().getDataNasc());
	}
}
