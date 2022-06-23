package com.exemplo.map;

import java.util.HashMap;
import com.exemplo.map.Produto;


public class ExemploHashMap {

	public static void main(String[] args) {

		// praticando a instanciando
		HashMap<String, Produto> mapProduto = new HashMap<>();

		// inserindo dados na coleção
		mapProduto.put("Leite", new Produto("Leite em pó", "Laticinios", 5.80));
		mapProduto.put("Cerveja", new Produto("Cerveja", "Bebida", 1.89));
		mapProduto.put("detergente", new Produto("Detergente", "Limpeza", 2.49));
		mapProduto.put("manteiga", new Produto("Manteiga", "Laticinios", 2.90));
		mapProduto.put("Creme", new Produto("Creme dental", "Higiene", 1.75));
		mapProduto.put("Sabonete", new Produto("Sabonete", "Higiene", 0.99));

		// veerificar se o map possui um determinado item
		System.out.println(mapProduto.containsKey("Cerveja"));

		// obter o elemento chave
		System.out.println(mapProduto.get("manteiga"));

		// remover um item
		mapProduto.remove("detergente");

		// mostrar a quantidade de itens que compoem a colecao
		System.out.println(mapProduto.size());


		// Exibir todos os itens do map
		mapProduto.forEach((chave, valor) -> System.out.println(valor));
	}

}
