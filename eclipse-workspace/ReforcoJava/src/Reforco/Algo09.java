package Reforco;

import java.util.Scanner;

public class Algo09 {

	public static void main(String[] args) {
		double salario;
		double reajuste;
		double novoSalario;
		float percReajuste = (float) (5.0/100);
		
Scanner cs = new Scanner(System.in);
		
		System.out.println("Digite o valor do salario: ");
		salario = cs.nextFloat();
		
		System.out.println(salario);
		
	//	System.out.println("Digite o valor do reajuste: ");
	//	percReajuste = cs.nextFloat();
		
		novoSalario = salario*percReajuste;
		System.out.println("o valor do reajuste é: " + novoSalario );
		
		System.out.println("o novo salrio é: " + salario+novoSalario);
	}

}
