package com.exemplo.bidimensional;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		// criar o array
		double notas[][][] = new double[100][4][3];
		// 100 é a qtde de alunos
		// 4 é eqtde de materias
		// 3 a qtde de notas
		
		//populando os arrays 
		notas[0][0][0] = 6.5;  //[0] primeiro aluno
		notas[0][1][1] = 8.5;
		notas[0][2][2] = 7.5;
		
		notas[1][0][0] = 6.5;  // [1] segundo aluno
		notas[1][1][0] = 9.2;
		notas[1][2][0] = 8.7;
		
		notas[99][0][0] = 5.3; // aluno [99] 
		notas[99][1][0] = 9.7;
		notas[99][2][0] = 8.1;
		
		System.out.println("As notas do primeiro aluno são: ");
		System.out.println(notas[0][2][2]);
		
		System.out.println("");
		System.out.println("As notas do segundo aluno: ");
		System.out.println(notas[1][0][0]);
		
		System.out.println("");
		System.out.println("As notas do Terceiro aluno: ");
		System.out.println(notas[99][0][0]);
		
	}
}
