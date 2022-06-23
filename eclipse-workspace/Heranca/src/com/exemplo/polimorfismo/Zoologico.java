package com.exemplo.polimorfismo;

public class Zoologico {

	public static void main(String[] args) {
		// instanciando as classes
		Animal animalzinho = new Animal(); // referencia do obj da classe pai
		animalzinho.comer(); // acesso ao metodo comer() da classe pai
		
		Zebra zebrinha = new Zebra(); // referencia do obj da subclasse zebra
		animalzinho = zebrinha; //referenciando o obj da classe derivada zebra a animalzinho
		animalzinho.comer(); // acesso ao metodo comer() da classe derivada Zebra()
		
		Leao leaozinho = new Leao(); //referencia do obj da subclasse Leao
		//animalzinho = leaozinho;
		animalzinho.comer(); //acesso ao metodo comer() da subclasse Leao()
		
		

	}

}
