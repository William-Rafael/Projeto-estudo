package com.exemplo.joinalive;

public class JuntandoThreads {

	public static void main(String[] args) throws Exception{
		// criar uma nova thread e tentar juntar a thread existente
		Thread t = new Thread(new ExemploJoin());
		// incializando a thread
		t.start();

		// tentando juntar as threads - com um intervalo de 2segundos 
		t.join(2000);
		
		System.out.println("Fazendo a junção depois de 2 segundos:");
		System.out.println("Thread atual: " + t.getName());
		
		// observando se a thread esta viva
		System.out.println()
	}

}
