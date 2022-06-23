package com.exemplo.abstrato;

public class Quadrado extends Poligono{
	//criar uma propriedade
	private double lado;
	
	// contrutor da classe
	public Quadrado(double lado) {
		this.lado = lado;
	}

	//acessar o método abstrato da classe Poligono()
	
	public double calcularArea() {
		double resultado = lado*lado;
		System.out.println("area do quadrado: " + resultado);
		return resultado;
	}
}
