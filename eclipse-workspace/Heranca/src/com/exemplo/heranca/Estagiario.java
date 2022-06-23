package com.exemplo.heranca;

public class Estagiario extends Dev{
	String relatorio;
	String horas;
	
	// contrutores
	//contrutor padrao
	public Estagiario() {}
	
	//contrutor customizado
	public Estagiario(String relatorio, String horas) {
		this.relatorio = relatorio;
		this.horas = horas;
	}
	
	//tentativa de construir um metodo para exibir os valores dos atib
	public void dadosEstagiario() {
		System.out.println("Informe sobre o relatorio: " + relatorio);
		System.out.println("qtde horas" + horas);
	}
	
}
