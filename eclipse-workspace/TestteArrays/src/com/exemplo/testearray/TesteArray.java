package com.exemplo.testearray;

public class TesteArray {
	public static void main(String[] args) {
		int elementos[][] = {{5,2,6},{10,12,0,5},{65,99}};
		//iterar pelo array
		
		for(int linha = 0; linha < elementos.length; linha++) {
			for(int col = 0; col < elementos[linha].length; col++) {
				System.out.println(elementos[linha][col] + " ");
			}
			
			System.out.println();
		}
	}
}
