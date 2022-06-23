package com.metodos.estaticos;

// a classe que esta fora deste pacote foi importada 
import com.exemplo.estatico.TestandoChamadaExterna;

public class ChamandoOsMetodos {
	
	//declarando um metodo dentro da classe
	static void novoEstatico() {
		System.out.println("este conteudo esta declarado no metodo dentro da classe principal");
}
	public static void main(String[] args) {
		// chamando o método estatico
		DeclarandoAlgunsMetodos.metodoEstatico(); //sem a necessidade de instancia
		
		// chamando o método não estatico
		new DeclarandoAlgunsMetodos().metodoNaoEstatico(); //praticando a instancia

		novoEstatico(); //chmando o metodo declarando na mesma classe
		
		
		//chamando o metodo estatico de uma classe pertecente a outro pacote
		TestandoChamadaExterna.metodoForaDoEsquema();
	}

}
