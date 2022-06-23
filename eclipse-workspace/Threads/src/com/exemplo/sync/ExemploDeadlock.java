package com.exemplo.sync;

public class ExemploDeadlock {
	//criando uma classe estatica
	
	private static class Recurso{
		public int value;
	}
	
	//criar os objetos
	private Recurso RecursoX = new Recurso();
	private Recurso RecursoY = new Recurso();
	
	// criar o metodo de leitura
	public int read() {
		synchronized(RecursoX) {
			synchronized(RecursoY) {
				return RecursoY.value + RecursoX.value;
			}
		}
	}
	
	
	//criar um metodo para escrever algo
	public void write(int x, int y) {
		synchronized(RecursoY) {
			synchronized(RecursoX) {
				RecursoX.value = x;
				RecursoY.value = y;
			}
		}
	}
}
