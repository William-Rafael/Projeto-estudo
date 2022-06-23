package atividades;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		int x,y;
		int resto;
		
		System.out.println("digite o primeiro numero: ");
		x = cs.nextInt();
		
		System.out.println("digite o segundo numero: ");
		y = cs.nextInt();
		
		resto = x % y;
		
		System.out.println("o resto da divisão é: " + resto);
		

	}

}
