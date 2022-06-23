package atividades;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		int num, sucessor;
		
		System.out.println("Digite um numero: ");
		num = cs.nextInt();
		sucessor = num + 1;
		
		
		System.out.println("e o seu sucessor é: " + sucessor);

	}

}
