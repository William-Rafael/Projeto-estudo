package com.exemplo.thread;

public class Segmento extends Thread{
	private String mensagem;
	
	public Segmento() {}
	
	public Segmento(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	public void run() {
		while(true) {
		System.out.println("Algo executando na Classe Segmento");
		}
	}
	// criar um novo metodo
	public void run(String segmento) {
		System.out.println("A String em execução é: " + mensagem);
	}

}
