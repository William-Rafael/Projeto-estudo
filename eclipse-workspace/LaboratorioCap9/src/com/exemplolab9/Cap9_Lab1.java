package com.exemplolab9;

public class Cap9_Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor professor1 = new Professor("Rafael", 38, 'M', 261454789, "05/02/1974", 2500, "Portugues");
		professor1.falar(" Manuel?");

		Aluno aluno1 = new Aluno("Manuel", 19, 'M', 521234567, "15/06/1993", 1099, "Ciencia da Computaçao");
		aluno1.falar(" Presente");

		professor1.falar(" Claudia?");

		Aluno aluno2 = new Aluno("Claudia", 22, 'F', 415678912, "12/08/1990", 799, "Administração");
		aluno2.falar(" Presente");

		professor1.mostrarDados();

		aluno1.mostrarDados();
		aluno2.mostrarDados();

	}

}
