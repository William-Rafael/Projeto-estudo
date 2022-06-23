package com.exemplo.thread;

public class ThreadPrincipal {

	public static void main(String[] args) {
		// criando os objs a partir das threads
		ThreadUm objUm = new ThreadUm();
		ThreadDois objDois = new ThreadDois();
		
		//inicializar as threads
		objUm.start();
		objDois.start();
		

	}

}
