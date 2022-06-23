package com.exemplo.generics;

public class ExecutandoGenerico {

	public static void main(String[] args) {
		// declarar e instanciar a classe generics
		CacheGenerico<String> cacheNome = new CacheGenerico<>();
		CacheGenerico<Integer> cachePortfolio = new CacheGenerico<>();
		
		// atribuição de valores
		
		cacheNome.setValor("Impacta");
		cachePortfolio.setValor(56);
		
		
		// exibir valores
		System.out.println("Nome : " + cacheNome.getValor());
		System.out.println("portfolio : " + cachePortfolio.getValor());
		

	}

}
