package com.exemplo.maisumathread;

public class NotificacaoTres extends Thread{

	// declarando um atributo
		NotificacaoUm n1;

		// contructor
		public NotificacaoTres(NotificacaoUm n1) {
			this.n1 = n1;
		}

		// metodo run()
		public void run() {
			synchronized (this.n1) {
				System.out.println("Inicializando " + Thread.currentThread().getName());
				
				//chamada do metodo notify
				this.n1.notify();
			}
			
			System.out.println(Thread.currentThread().getName() + "... notificada!");
		}
	}


