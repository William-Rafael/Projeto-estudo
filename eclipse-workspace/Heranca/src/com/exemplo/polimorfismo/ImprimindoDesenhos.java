package com.exemplo.polimorfismo;

public class ImprimindoDesenhos {

	public static void main(String[] args) {
		// instancias
		Desenho d = new Desenho();
		Desenho q = new Quadrado();
		//Desenho t = new Triangulo();
		
		// chamar o m�todo imprimir
		d.imprimir();
		q.imprimir();
		//t.imprimir();

	}

}
