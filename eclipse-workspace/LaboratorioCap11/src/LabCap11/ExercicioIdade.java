package LabCap11;

import java.util.Scanner;

public class ExercicioIdade {

	public static void main(String[] args) {
		try {
		String ano;
		
Scanner in = new Scanner(System.in);
		
		System.out.println("digite o ano de seu nascimento: ");
		ano = in.next();
		int anoNasc = Integer.parseInt(ano);
		}catch(NumberFormatException e) {
			System.out.println("formato Invalido!");
			e.printStackTrace();
		
	}

}
}
