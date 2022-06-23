package Desafio2;

import java.util.Scanner;

public class Desafio_2 {

	public static void main(String[] args){

		//criando a matriz com 3 posicoes
		int matriz1[][] = new int[3][1];

		//inicializnado scanner que ira pegar o dado na tela
		Scanner sc = new Scanner(System.in);

		//pegando o valor e colocando na primeira matriz
		System.out.println("Digite o valor da matriz 1: ");
		int valorMatriz1 = sc.nextInt();

		//pegando o segundo valor e colocando na segunda matriz
		System.out.println("Digite o valor da matriz 2: ");
		int valorMatriz2 = sc.nextInt();


		//pegando os valorores e colocando em cada matriz
		matriz1[0][0] = valorMatriz1;
		matriz1[1][0] = valorMatriz2;


		//multiplicando os valores e colocando na matriz 3
		matriz1[2][0] = matriz1[0][0] * matriz1[1][0];

		System.out.println("Resultado = " + matriz1[2][0]);
	
	}
}