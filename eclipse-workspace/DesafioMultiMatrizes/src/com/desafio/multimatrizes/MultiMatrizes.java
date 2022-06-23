package com.desafio.multimatrizes;

import java.util.Scanner;

public class MultiMatrizes {

	public static void main(String[] args) {
		Scanner recebeValor = new Scanner(System.in);
		// definindo a ordem das matrizes
		int ordemM = 3;
		// definir as variaveis auxiliares
		int linha, coluna, soma, auxMulti;
		// referenciar a primeira matriz
		int matrizA[][] = new int[ordemM][ordemM];
		// referenciar a segunda matriz
		int matrizB[][] = new int[ordemM][ordemM];
		// referencia a matriz resultante(produto das matrizes A x B)
		int matrizAB[][] = new int[ordemM][ordemM];

		// bloco de entrada de dados - montando a primeira matriz(matrizA)
		System.out.println("valores solicitados para criar a matriz A - ");
		// montando as linhas da matrizA
		for (linha = 0; linha < ordemM; linha++) {
			System.out.printf("informe os elementos da %da. linha: ", (linha + 1));
			for (coluna = 0; coluna < ordemM; coluna++) {
				System.out.printf("\nMatrizA[%d][%d] = ", linha, coluna);
				matrizA[linha][coluna] = recebeValor.nextInt();
			}
			System.out.println("\n");
		}

		// bloco de entrada de dados - montando a segunda matriz(matrizb)
		System.out.println("valores solicitados para criar a matrizB - 2ª matriz");
		// montando as linhas da matrizB
		for (linha = 0; linha < ordemM; linha++) {
			System.out.printf("informe os elementos da %da. linha", (linha + 1));
			for (coluna = 0; coluna < ordemM; coluna++) {
				System.out.printf("\nmatrizB[%d][%d] = ", linha, coluna);
				matrizB[linha][coluna] = recebeValor.nextInt();
			}
			System.out.println("\n");
		}
		// bloco de processamento; multiplicando as matrizes para obtencao de seu
		// produto
		// contruindo a matriz resultante - matrizAB
		for (linha = 0; linha < ordemM; linha++) {
			for (coluna = 0; coluna < ordemM; coluna++) {
				soma = 0;
				for (auxMulti = 0; auxMulti < ordemM; auxMulti++) {
					soma = soma + (matrizA[linha][auxMulti] * matrizB[auxMulti][coluna]);
				}
				matrizAB[linha][coluna] = soma;
			}
		}

		// bloco de saida: exibindo as matrizes
		System.out.println("\nValores inseridos na matrizA - 1ª matriz");
		for (linha = 0; linha < ordemM; linha++) {
			System.out.printf("%d. linha => " + (linha + 1));
			for (coluna = 0; coluna < ordemM; coluna++) {
				System.out.printf("%d. ", matrizA[linha][coluna]);
			}
			System.out.println("\n");
		}
		System.out.println("\nValores inseridos na matrizB - 2ª matriz");
		for (linha = 0; linha < ordemM; linha++) {
			System.out.printf("%d. linha => " + (linha + 1));
			for (coluna = 0; coluna < ordemM; coluna++) {
				System.out.printf("%d ", matrizB[linha][coluna]);

			}
			System.out.println("\n");
		}
			System.out.println("\nMatriz resultante - produto da matriz A x matrizB");
			for (linha = 0; linha < ordemM; linha++) {
				System.out.printf("%d. linha => " + (linha + 1));
				for (coluna = 0; coluna < ordemM; coluna++) {
					System.out.printf("%d ", matrizAB[linha][coluna]);

				}
			}
		}
	}

