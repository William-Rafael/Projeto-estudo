package com.example.novosaudar.model;
//classe que sera o model domain da aplicacao
public class Saudacao {
	
	//definicao dos atributos
	private final long id;
	private final String minhaSaudacao;
	
	//getters
	public long getId() {
		return id;
	}
	public String getMinhaSaudacao() {
		return minhaSaudacao;
	}
	
	//contrutor
	public Saudacao(long id, String minhaSaudacao) {
		super();
		this.id = id;
		this.minhaSaudacao = minhaSaudacao;
	}
	
}
