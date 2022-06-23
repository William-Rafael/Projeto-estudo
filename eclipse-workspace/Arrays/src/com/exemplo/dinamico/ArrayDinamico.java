package com.exemplo.dinamico;

public class ArrayDinamico {
	// criar o método fora do principal para receber como argumento do parametro um array
	
	static void receberArray(int umArray[]) {
		//criando um loop para exibir o conteudo do array
		
		for(int exibir : umArray) {
			System.out.println(exibir);
		}
		
	}

	public static void main(String[] args) {
		// instancia da classe
		ArrayDinamico a = new ArrayDinamico();
		a.receberArray(new int[] {8, 9, 2, 3});
		
		// exibindo o array
		
		

	}

}
