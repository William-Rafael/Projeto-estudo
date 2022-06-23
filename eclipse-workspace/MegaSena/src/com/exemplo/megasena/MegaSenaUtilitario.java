package com.exemplo.megasena;

import java.util.Random;

public class MegaSenaUtilitario {
	
	//método da classe utilitario
	public static int sortearNumero() {
		Random sorteador = new Random();
		int numero = sorteador.nextInt();
		
		
		
		//estabelecendo um loop
		while(numero <=0 || numero > 60) {
			numero = sorteador.nextInt();
		}
		
		return numero;
		
	}

}
