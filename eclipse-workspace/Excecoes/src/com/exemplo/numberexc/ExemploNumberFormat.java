package com.exemplo.numberexc;

public class ExemploNumberFormat {

	public static void main(String[] args) {
		// uso do try/catch
		try {
			String texto = "10xpt23";
			int Idade = Integer.parseInt(texto);
			
			System.out.println("Parabéns pelo seus " + Idade + "anos de idade.");
		}catch(NumberFormatException e) {
			System.out.println("Numero Invalido!");
			e.printStackTrace();
		}

	}

}
