package JavaBasicos;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("digite a sua idade: ");
		int idadeUsu = in.nextInt();
		
		System.out.println("Digite a idade da sua mãe: ");
		int idadeMae = in.nextInt();
		
		int diferenca = idadeMae - idadeUsu;
		
		System.out.println("a diferenca de idade é: " + diferenca);
		}
		

	}


