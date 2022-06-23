package Reforco;

import java.util.Scanner;

public class Algo08 {

	public static void main(String[] args) {
		float total;
		float votoBrancos;
		float nulos;
		float validos = 0;
Scanner cs = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de votos: ");
		total = cs.nextFloat();
		
		
		System.out.println("Digite a quantidade de votos nulos: ");
		nulos = cs.nextFloat();
		
		System.out.println("Digite a quantidade de votos em branco: ");
		votoBrancos = cs.nextFloat();
		
		nulos = total - nulos;
		System.out.println("o total de votos é: " + total);
		
		
		
		
		

	}

}
