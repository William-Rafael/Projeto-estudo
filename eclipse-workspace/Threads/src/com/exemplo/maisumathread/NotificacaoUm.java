package com.exemplo.maisumathread;

public class NotificacaoUm extends Thread{
	
	//metodo run()
	public void run() {
		synchronized(this) {
			System.out.println("inicializacao de : " + Thread.currentThread().getName());
		//	this.n1.notify();
			
			
			//bloco try/cath
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "...notificada");
		}
	}

}
