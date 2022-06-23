package com.exemplo.trycatch;

public class BlocoTryCatch {

	public static void main(String[] args) {
		// tentantiva de gerar uma exception
		//definindo uma variavel
		
		int i;
		
		// bloco try
		try {
			i = 1/0;
			i = 2;
			System.out.println(i);
			}catch(ArithmeticException e) {
				System.out.println("tratando a excecao: ");
				e.printStackTrace();
			}
		System.out.println("Continuacao do codigo!");
	}

}
