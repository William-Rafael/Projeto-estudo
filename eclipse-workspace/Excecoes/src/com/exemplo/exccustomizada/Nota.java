package com.exemplo.exccustomizada;

public class Nota {
	
	// criar dois atributos
	private String aluno;
	private int nota;
	
	//criar um metodo contrutor
	public Nota(String aluno, int nota) throws NotaInvalidaException{
		this.setAluno(aluno);
		this.setNota(nota);
	}
	
	public String getAluno() {
		return this.aluno;
	}
	public void setAluno(String aluno) {
		this.aluno = aluno;
	}
	public int getNota() {
		return this.nota;
	}
	//tratamento da propriedade nota
	public void setNota(int nota) throws NotaInvalidaException {
		if(nota < 0 || nota > 10) {
			NotaInvalidaException e = new NotaInvalidaException();
			throw e;
		}else {
			this.nota = nota;
		}
	}
	
}
