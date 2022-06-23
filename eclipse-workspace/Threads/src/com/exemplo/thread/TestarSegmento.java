package com.exemplo.thread;

public class TestarSegmento {

	public static void main(String[] args) {
		Segmento s = new Segmento();
		s.start();
		
		ExemploRunnable rodar = new ExemploRunnable();
		rodar.start();
		
		
		for(int i = 0; i < 3; i++) {
			s.yield();
			System.out.println(Thread.currentThread().getName() + "em execução");
		}
	}

}
