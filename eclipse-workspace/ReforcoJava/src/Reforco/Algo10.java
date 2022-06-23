package Reforco;

import java.util.Scanner;

public class Algo10 {

	public static void main(String[] args) {
		float custoFabrica;
		float custoDistribuidor;
		float imposto;
		float valorFinal;
Scanner cs = new Scanner(System.in);
		
		System.out.println("Digite o valor do carro: ");
		custoFabrica = cs.nextFloat();
		
		imposto = (45*custoFabrica) /100;
		custoDistribuidor = (28*custoFabrica) /100;
		valorFinal = custoFabrica+imposto+custoDistribuidor;
		
		
		
		
		
		
		System.out.println(valorFinal);
		

	}

}
