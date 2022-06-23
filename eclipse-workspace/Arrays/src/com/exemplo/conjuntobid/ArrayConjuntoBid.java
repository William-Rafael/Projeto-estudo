package com.exemplo.conjuntobid;

public class ArrayConjuntoBid {

	public static void main(String[] args) {
		// criando o array
		int conjunto [][] = {{0, 1, 1}, {3, 5, 8, 13}, {22, 89, 35}};
		
		// estabelecendo o loop
		for(int i = 0; i < conjunto.length; i ++) {
			for(int j = 0; j < conjunto.length; j++) {
				// exibindo valores
				
				System.out.println(conjunto[i][j]);
			}
		}

	}

}
