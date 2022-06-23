package exemplo1;

public class ExercicioPag88 {

	public static void main(String[] args) {
		// declarando a variavel numero
		
		int numero = 337;
	
		for (int i = 2; i < numero; i++) {
			if(numero % i ==0)
				
				System.out.println("O numero não é primo: " + numero);
				
		
			
			}
			System.out.println(" é primo: " + numero);
		}
	
			
			
			
				
		
		

	}





//Vamos criar um programa que verifica se um número é primo. Lembre-se de
//que um número primo só é divisível por 1 e por ele mesmo.
//1. Crie uma classe e insira a estrutura básica de um programa Java;
//2. Declare uma variável chamada numero, que receberá o valor a ser verificado
//se é primo ou não;
//3. Implemente uma lógica onde será contado o número de divisores do número
//informado;
//4. Ao final da contagem, se o número de divisores encontrados for superior a
//dois, o número informado não é primo. Caso contrário, é primo;
//Lembre-se que 0 (zero) e 1 (um) não são considerados números primos