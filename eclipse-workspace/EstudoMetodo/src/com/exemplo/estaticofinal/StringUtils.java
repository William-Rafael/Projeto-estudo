package com.exemplo.estaticofinal;

public class StringUtils {
	//criando o método estatico
	public static String inverterString(String texto) {
		//criar os dois conjuntos de caracteres
		char[] letras = texto.toCharArray();
		
		char[] letrasInversas = new char[letras.length];
		
		//contruir o loop para iterar sobre o conjunto de valores e executar a operacao
		for(int i = 0; i < letras.length; i++) { //A ' M ' O ' R' 
			//executar a operacao de inversao    //0 ' 1 ' 2, 3   posicoes 
			letrasInversas[letras.length -i -1] = letras[i];
			
		}
		return new String(letrasInversas);
	}

}
