package com.exemplo.hash;


import com.exemplo.hash.Pessoa;

public class ExemploHash {

		public static void main(String[] args) {
			// praticando as instancias da classe
			
			Pessoa a = new Pessoa("Rojas" , 23);
			Pessoa b = new Pessoa("Idia" , 19);
			
			System.out.println(a.nome + " é igual a " + b.nome + " ? " + (a.hashCode() == b.hashCode()));
			
			a.nome = b.nome; // nomes iguais e objetos diferentes
			
			System.out.println(a.nome + " é igual a " + b.nome + " ? " + (a.hashCode() == b.hashCode()));
			
			a = b; // objetos iguais 
			
			System.out.println(a.nome + " é igual a " + b.nome + " ? " + (a.hashCode() == b.hashCode()));
		}

	}
