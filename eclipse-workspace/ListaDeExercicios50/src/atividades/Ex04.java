package atividades;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		int x,y, result;
		System.out.println("digite um numero: ");
		x = cs.nextInt();
		System.out.println("digite outro numero: ");
		y = cs.nextInt();
		
		result = x*y;
		
		System.out.println("O resultado da multiplicação é: " + result);
	}

}
