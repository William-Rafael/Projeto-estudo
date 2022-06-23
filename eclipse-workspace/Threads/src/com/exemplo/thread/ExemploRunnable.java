package com.exemplo.thread;

public class ExemploRunnable implements Runnable {
	private String umaMensagem;
	
	
	
	public String getUmaMensagem() {
		return umaMensagem;
	}

	public void setUmaMensagem(String umaMensagem) {
		this.umaMensagem = umaMensagem;
	}
	// contrutor
	public ExemploRunnable() {}

	public ExemploRunnable(String umaMensagem) {
		this.run(umaMensagem);
	}

	public void run(String umaMensagem) {
		while (true) {
			// TODO Auto-generated method stub
			System.out.println(umaMensagem);
	}

}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}
