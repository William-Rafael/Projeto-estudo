package Reforco;

import java.util.Scanner;

public class Algo06 {

	public static void main(String[] args) {
		int base;
		int altura;
		int area;
		
Scanner cs = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da base: ");
		base = cs.nextInt();
		
			
		System.out.println("Digite o tamanho da altura: ");
		altura = cs.nextInt();

		area = base*altura;
		System.out.println("A area do retangulo é: " + area);
	}

}
