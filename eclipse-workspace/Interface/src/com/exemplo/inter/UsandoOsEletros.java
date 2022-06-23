package com.exemplo.inter;

public class UsandoOsEletros {
	//criar o metodo principal 
	public static void main(String[] args) {
		//definir variaveis
		Eletrodomestico a, b, c, d, e, f, g;
		
		
		//instanciando classes
		a = new Geladeira();
		b = new Televisao();
		c = new Televisao();
		d = new Geladeira();
		e = new Microondas();
		f = new Televisao();
		g = new Microondas();
		
		// chamar o metodo ligarTudo()
		Eletrodomestico.ligarTudo(a, b, c, d, e, f, g);
	}

}
