package atividades;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		int x,y;
		int troca;
		
		System.out.println("digite o valor de x: ");
		x = cs.nextInt();
		
		System.out.println("Digite o valor de y: ");
		y = cs.nextInt();
		
		troca = x;
		x = y;
		y = troca;
		
		System.out.println("o valor de x agora �: " + x);
		System.out.println("o valor de y agora �: " + y);
		
	}

}
