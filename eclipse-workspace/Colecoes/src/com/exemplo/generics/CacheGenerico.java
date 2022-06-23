package com.exemplo.generics;

public class CacheGenerico <T>{  //T parametro de elemento Generico
//indica um atributo generico
	private T valor;
	//get e set
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	
}
