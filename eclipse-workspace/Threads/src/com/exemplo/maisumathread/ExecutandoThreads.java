package com.exemplo.maisumathread;

public class ExecutandoThreads {

	public static void main(String[] args) throws InterruptedException{
		//praticar as instancias das Threads
		NotificacaoUm n1 = new NotificacaoUm();
		NotificacaoDois n2 = new NotificacaoDois(n1);
		NotificacaoTres n3 = new NotificacaoTres(n1);

		//criando as threads
		Thread t1 = new Thread(n1, "Thread Um " );
		Thread t2 = new Thread(n2, "Thread Dois ");
		Thread t3 = new Thread(n3, "Thread tres ");
		
		//inicializando as threads com a chamada do metodo run()
		t1.start();
		Thread.sleep(3000);
		t2.start();
		Thread.sleep(3000);
		t3.start();
	}

}
