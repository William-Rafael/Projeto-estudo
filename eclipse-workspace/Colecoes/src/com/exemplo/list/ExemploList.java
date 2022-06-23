package com.exemplo.list;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		// definindo uma list
		List<String> paises = new ArrayList<>();
		
		//inserindo dados na coleção
		paises.add("Brasil");
		paises.add("Portugal");
		paises.add("Estados Unidos");
		paises.add("França");
		paises.add("Inglaterra");
		paises.add(2,"Italia");
		
			//exibindo valores 
		System.out.println("Países na ordem original:");
		paises.forEach(pais -> System.out.println(" - " + pais));
		
		
		System.out.println("============================================================");
		
		//verificar se a lista possui o valor Estados unidos
		System.out.println(paises.contains("Estados Unidos"));
		
		//exibir o elemento da posicao 2 
		System.out.println(paises.get(2));
		
		//exibindo o tamnaho da lista
		System.out.println(paises.size());
		
		//exibir o indice posicional do valor França
		System.out.println(paises.indexOf("França"));
		
		//transformar os elementos com valores descritos em letras maiusculas
		paises.replaceAll(maiusculo -> maiusculo.toUpperCase());
		
		//reordenar a lista utilizando a ordem natural das strings
		paises.sort((w, h)-> w.compareTo(h));
		System.out.println("============================================================");
		
		//exibir os valores das duas ultimas manipulacoes
		System.out.println("Paises ordenados e em letras maiusculas:");
		paises.forEach(manipulados -> System.out.println(" - " + manipulados));
	}

}
