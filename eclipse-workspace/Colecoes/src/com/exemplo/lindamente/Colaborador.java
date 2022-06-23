package com.exemplo.lindamente;

public class Colaborador {
	private int matricula;
	private String nome;
	private String cargo;
	private double salario;
	
	// getters e setters
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// contrutor
	public Colaborador(int matricula, String nome, String cargo, double salario) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	@Override
	public String toString() {
		return this.getMatricula() + "\t" +
	this.getNome() + "\t\t" +
	this.getCargo() +  "\t\t" +
	this.getSalario();
	}
}


