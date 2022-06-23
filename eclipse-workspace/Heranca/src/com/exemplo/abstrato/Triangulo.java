package com.exemplo.abstrato;

public class Triangulo extends Poligono{
	// definir as propriedades
	private double base;
	private double altura;
	
	// contrutor
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	//chamar o metodo abstrato para implementacao na classe concreta
	public double calcularArea() {
		double resultado = (base * altura)/2;
		System.out.println("area do triangulo: " + resultado);
		return resultado;
	}

}
