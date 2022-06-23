package com.exemplo.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {
		// operacao com treeSet
		TreeSet<String> treinamentos = new TreeSet<>();
		
		//fazendo uso do objeto treinamentos
		treinamentos.add("Java");
		treinamentos.add("Javascript");
		treinamentos.add("SQL");
		treinamentos.add("ASP");
		treinamentos.add("C#");
		
		//fazer uso do metodo iterator
		Iterator<String> iteradora = treinamentos.iterator();
		System.out.println("Treinamentos ordenados por ordem alfabetica: \n");
		
		
		// loop para exibir valores
		while(iteradora.hasNext()) {
			String nomeTreinamento = iteradora.next();
			System.out.println("Nome do treinamento - " + nomeTreinamento);
		}
	}

}
