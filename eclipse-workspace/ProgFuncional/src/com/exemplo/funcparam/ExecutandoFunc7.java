package com.exemplo.funcparam;

public class ExecutandoFunc7 {

	public static void main(String[] args) {
		ExemploFuncional6 calculando = Financeiro::calculaJuros; // :: expressao lambda :classe outro metodo
		
		System.out.println("Valor Final: " + calculando.execute(1200.0, 9.3));

	}

}
