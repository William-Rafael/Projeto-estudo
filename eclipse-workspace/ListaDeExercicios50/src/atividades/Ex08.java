package atividades;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		double dolar = 1;
		double reais = 5.15;
		double converter;
		
		System.out.println("Digite o valor em dolar: ");
		dolar = cs.nextDouble();
		
		reais = dolar * 5.15;
		
		System.out.println("o valor em reais é: " + reais);

	}

}
