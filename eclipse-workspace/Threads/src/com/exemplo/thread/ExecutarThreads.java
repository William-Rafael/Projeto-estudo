package com.exemplo.thread;

public class ExecutarThreads extends Thread{

	//public static void main(String[] args) {
		// criar um atributo privado
		private String mensagem;
		
		//criar um metodo
		public ExecutarThreads(String mensagem) {
			this.mensagem = mensagem;
		}
		
		//  usando o metodo run()
		public void run() {
			//loop para iterar por valores - sejam eles quantos forem
			while(true) {
				System.out.println(mensagem);
			}
		}
		//praticando a instancia da classe
	//	Segmento objSeg = new Segmento();
	//	objSeg.run("Texto Bacana!");
		
		public static void main(String[] args) {
			ExecutarThreads objThread = new ExecutarThreads("Executando uma thread???");
			objThread.start();
			
			Segmento umaThreadSeg = new Segmento();
			umaThreadSeg.start();
			
			Segmento umaThreadSeg1 = new Segmento("Olaaaaaaaaaaaaaaa Thread");
			umaThreadSeg1.start();
			
			
			ExemploRunnable teste = new ExemploRunnable("Executando Runnable. tra la la la la");
			teste.start();
			
			//praticando a instancia da classe
			
			while(true) {
				System.out.println("Essa é a thread principal. Executando....");
			}
			
			
		}
	}


