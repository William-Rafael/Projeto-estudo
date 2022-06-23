package com.exemplo.funcparam;

public class Financeiro {
	
	//criando um metodo static
	
		public static double calculaJuros(double valorInicial, double taxaJuros) {
			double razao = taxaJuros/ 100;
			double juros = valorInicial * razao;
			return valorInicial + juros;
		}
	}

