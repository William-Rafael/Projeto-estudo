package com.exemplo.thread.runnable;

public class TarefaPrincipal {

	public static void main(String[] args) {
		Runnable obj1 = new TarefaUm();
		Runnable obj2 = new TarefaDois();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		

	}

}
