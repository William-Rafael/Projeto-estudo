package Reforco;

import java.util.Scanner;

public class Algo05 {

	public static void main(String[] args) {
		int numero;
		int antecessor;
		Scanner cs = new Scanner(System.in);
		
		System.out.println("Digite o numero: ");
		numero = cs.nextInt();
		
		antecessor = numero -1;
		System.out.println("o seu antecessor é: " + antecessor);

	}

}
