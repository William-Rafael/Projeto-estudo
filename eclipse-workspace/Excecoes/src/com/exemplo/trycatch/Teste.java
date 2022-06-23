package com.exemplo.trycatch;

public class Teste {

	public static void main(String[] args) {
		// Try/catch para a chamada do 1� metodo
		try {
			// chamar o metodo aqui
			metodo1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 1� metodo
	public static void metodo1() throws Exception {
		try {
			// chamar o metodo 2
			metodo2();

		} catch (Exception e) {
			throw new Exception("excecao descrita no 1�  metodo", e);
		}
	}

	// 2� metodo
	public static void metodo2() throws Exception{
		throw new Exception("Excecao descrita no 2� metodo");
	}

}
