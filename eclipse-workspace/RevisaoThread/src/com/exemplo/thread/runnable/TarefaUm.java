package com.exemplo.thread.runnable;

public class TarefaUm implements Runnable{
	public void run() {
	//estabelecer um loop
	for(int i = 0; i < 5; i++) {
		System.out.println("TarefaUm");
		
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			
		}
	}
	
}
}
