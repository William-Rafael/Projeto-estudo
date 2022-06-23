package com.exemplo.funcparam;

public class ExecutandoFunc2 {

	public static void main(String[] args) {
		// implementacao referenciando metodo sem parametro
		ExemploFunciona2 executar = () -> System.out.println("Olá mundo do java Funcional");
		executar.umMetodo();

	}

}
