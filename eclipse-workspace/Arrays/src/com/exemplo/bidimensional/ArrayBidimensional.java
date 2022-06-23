package com.exemplo.bidimensional;

public class ArrayBidimensional {

	public static void main(String args[]){
		
		// cria a matriz com 9 posicoes na primeira e 9 na segunda
		int matriz[][] = new int[9][9];
		
			// for criado para inserir os dados na matriz
			//inicializa o primeiro for para o primeiro array da matriz
			for(int i=0; i<9; i++){
				int cont = 1;
				//inicializa o segundo for para o segundo array da matriz
				for	(int j=0; j<9; j++){
					matriz[i][j] = cont++;
				}
			}
		
			System.out.println("Conteúdo de cada posição da matriz: ");
		// for criado para mostrar o conteúdo de cada posição da matriz
			//inicializa o primeiro for para o primeiro array da matriz
			for(int i=0; i<9; i++){
				int cont = 1;
				//inicializa o segundo for para o segundo array da matriz
				for	(int j=0; j<9; j++){
					System.out.println("m[" + i + "][" +j + "] = " + matriz[i][j]);
				}
			}
		
		System.out.println("Conteúdo da matriz completa: ");
		// for criado para mostrar o conteúdo de cada posição da matriz
			//inicializa o primeiro for para o primeiro array da matriz
			for(int i=0; i<9; i++){
				int cont = 1;
				//inicializa o segundo for para o segundo array da matriz
				for	(int j=0; j<9; j++){
					System.out.print(matriz[i][j]);
				}
				System.out.println("");
			}
		
		
		// for criado para mostrar o conteúdo de cada posição da matriz
			//inicializa o primeiro for para o primeiro array da matriz
		int soma = 0;
			for(int i=0; i<9; i++){
				//Soma somente a terceira coluna
					soma = soma + matriz[2][i];
			}
		System.out.println("Soma da terceira coluna da matriz: " + soma);
	}
}
