package Reforco;

import java.util.Scanner;

public class Algo07 {

	public static void main(String[] args) {
		int idade;
		int mes = 12;
		int dias = 30;
		int anos = 365;
		
Scanner cs = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		idade = cs.nextInt();
		
		idade = idade *mes;
		System.out.println("sua idade em mes é: " + idade);
		
		dias = (idade * dias) + (mes * dias);
		System.out.println("Sua idade em dias é: " + dias);
	}

}
