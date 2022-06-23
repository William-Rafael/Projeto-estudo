package JavaBasicos;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		double dias;
		double diasAno = 365;
		double diaMes = 30;
		double mes;
		double anos;
		
		Scanner cs = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos: ");
		anos = cs.nextDouble();
		
		System.out.println("digite quantos meses: ");
		mes = cs.nextDouble();
		
		
		System.out.println("E os dias: ");
		dias = cs.nextDouble();
		
		dias += (anos * diasAno) + (mes * diaMes);
		
		System.out.println("A sua idade em dias é: " + dias);

	}

}
