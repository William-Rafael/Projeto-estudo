package com.exemplo.maisumathread;

public class NotificacaoDois extends Thread {
	// declarando um atributo
	NotificacaoUm n1;

	// contructor
	public NotificacaoDois(NotificacaoUm n1) {
		this.n1 = n1;
	}

	// metodo run()
	public void run() {
		synchronized (this.n1) {
			System.out.println("Inicializando " + Thread.currentThread().getName());
			//chamada do metodo notify
			this.n1.notify();
			
			
			try {
				this.n1.wait(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
		}
		// bloco try/catch
		
		}
		System.out.println(Thread.currentThread().getName() + "... notificada!");
	}
}
