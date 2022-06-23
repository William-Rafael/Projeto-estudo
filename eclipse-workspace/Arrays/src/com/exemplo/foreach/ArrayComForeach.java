package com.exemplo.foreach;

public class ArrayComForeach {

	public static void main(String[] args) {
		// criando o array
		int[] numeros = new int[6];
		
		//populando o array
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		numeros[5] = 60;
		
		// estabelecendo o loop para percorrer os elementos do array
		for(int num: numeros) {
			//exibindo os valores
			System.out.println(num);
		}
		

	}

}
