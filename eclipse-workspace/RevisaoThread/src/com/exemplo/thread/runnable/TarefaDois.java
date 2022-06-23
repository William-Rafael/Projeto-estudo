package com.exemplo.thread.runnable;

public class TarefaDois implements Runnable {
	public void run() {

		// estabelecer um loop
		for (int i = 0; i < 5; i++) {
			System.out.println("TarefaDois");

			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}
		}
	}
}