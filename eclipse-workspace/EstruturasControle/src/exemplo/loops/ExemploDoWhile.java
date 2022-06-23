package exemplo.loops;

public class ExemploDoWhile {

	public static void main(String[] args) {
		// declarar uma variavel com um valor inicial para operar o loop
		int num = 15;
		//construcao do loop do/while
		do {
			// operacao executada ao menos uma vez
			System.out.println("Valor de num é : " + num);
			num++;
			
		}while(num < 25);

	}

}
