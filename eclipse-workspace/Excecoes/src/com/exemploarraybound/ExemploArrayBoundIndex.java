package com.exemploarraybound;

public class ExemploArrayBoundIndex {

	public static void main(String[] args) {
		// bloco try/catch
		try {
			double[]salario = {12000.0, 63300.0, 25300.0}; //posições 0 / 1 / 2
			double s = salario[3]; // posição do array 
			
			System.out.println("Salario Atual: " + s);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Numero invalido!");
			e.printStackTrace();
		}

	}

}
