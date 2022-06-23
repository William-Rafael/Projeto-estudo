package atividades;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		double salario;
		double reajuste;
		double total;
		
		System.out.println("Digite o valor do salario: ");
		salario = cs.nextDouble();
		
		reajuste = salario *0.07;
		
		System.out.println("o Valor do reajuste é de :" + reajuste);
		
		total = reajuste + salario;
		
		System.out.println("o Valor total do salario é: " + total);

	}

}
