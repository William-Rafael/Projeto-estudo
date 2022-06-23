package com.exemplo.inter;

public interface Eletrodomestico {
	//descrever dois metodos void
	void ligar();
	void desligar();
	
	//descrever um novo metodo
	static void ligarTudo(Eletrodomestico... eletroArray) {
		//fpr para percorrer os elementos
		for(Eletrodomestico eletro: eletroArray) {
			eletro.ligar();
		}
	}
	

}
