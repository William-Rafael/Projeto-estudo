package com.exemplo.polimorfismo;

public class InstanceOf {

	public static void main(String[] args) {
		// descrevendo uma classe com o tipo contruido String
		
		String a = "um valor qualquer";
		if(a instanceof String) {
			System.out.println("A variavel � do tipo String");
		}else {
			System.out.println("n�o �, essa variavel, do tipo String ");
			
		}

	}

}
