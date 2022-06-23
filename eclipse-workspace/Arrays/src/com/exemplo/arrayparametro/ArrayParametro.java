package com.exemplo.arrayparametro;

public class ArrayParametro {

	public static void main(String[] args) {
		// referenciando dois arrays 
		int valoresA[] = new int[3];
		int valoresB[] = new int[3];
		
		//popular o array valoresA com 3 valores distintos 
		valoresA[0] = 10;
		valoresA[1] = 20;
		valoresA[2] = 30;
		
		//populando o array valoresB
		valoresB = dobrarValores(valoresA);
		
		// estabelecer um loop
		//para iterar o array valoresB
		
		for(int i = 0; i < valoresB.length; i++) {
			// exibir os valores
			System.out.println("valoresB[" + i + "] = " + valoresB[i]);
		}
		

	}
	static int[] dobrarValores(int[] x) {
		//estabelecer o loop
		for(int i = 0; i < x.length; i++) {
			x[i] *= 2;
		}
		return x;
	}

}
