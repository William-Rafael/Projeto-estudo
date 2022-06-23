package atividades;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		String nome;
		String endereco;
		String telefone;
		
		System.out.println("digite o nome: ");
		nome = cs.nextLine();
		
		System.out.println("digite o endereço: ");
		endereco = cs.nextLine();
		
		System.out.println("Digite o telefone: ");
		telefone = cs.nextLine();
		
		
		System.out.println("Nome: " + nome + " Endereço: " + endereco + " Telefone: " + telefone );
		

	}

}
