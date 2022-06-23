package com.exemplo.testearray.transposta;

//criar um programa que nos de como resultado a transposicao de uma matriz
public class MatrizTransposta {

	public static void main(String[] args) {
		// criar uma matriz de 3 x 3
		int original [][] = {{5,2,6},{8,98,54},{78,95,1}};
		
		//criar uma nova matriz para receber a transposta
		int transposta[][] = new int [3][3];
		
		//imprimindo a matriz original
		System.out.println("Esta é a matriz original:\n");
		for(int linha = 0; linha < 3; linha++) {
			for(int col = 0; col < 3; col++) {
				System.out.print(original[linha][col] + " ");
			}
			System.out.println();
		}
		
		//criando a estrutura da transposicao da matriz original
		for(int linha = 0; linha <3; linha++) {
			for(int col = 0; col < 3; col++) {
				//transposicao
				transposta[linha][col] = original[col][linha];
			}
		}
		//imprimindo a matriz transposta
		System.out.println("\nEsta é a matriz transposta!\n");
		for(int linha = 0; linha < 3; linha++) {
			for(int col = 0; col < 3; col++) {
				System.out.print(transposta[linha][col] + " ");
			}
			System.out.println();
		}
	}

}
