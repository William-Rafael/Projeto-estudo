package JavaBasicos;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		double saldo;
		double reajuste;
		
		Scanner cs = new Scanner(System.in);
		System.out.println("Digite o valor do saldo: ");
		saldo = cs.nextDouble();
		
		reajuste = (saldo + 1) / 100;
		saldo = reajuste + saldo;
		
		System.out.println("O valor do saldo com o reajuste é: " + saldo);
	}

}
