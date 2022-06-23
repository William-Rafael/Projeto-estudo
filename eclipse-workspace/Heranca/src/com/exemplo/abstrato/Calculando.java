package com.exemplo.abstrato;

public class Calculando {

	public static void main(String[] args) {
		//criar as instancias das classes quadrado() e triangulo()
		Quadrado q = new Quadrado(10);
		Triangulo t = new Triangulo(5, 20);
		
		q.calcularArea();
		t.calcularArea();

	}

}
