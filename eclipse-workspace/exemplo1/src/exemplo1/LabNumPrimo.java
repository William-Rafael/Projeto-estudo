package exemplo1;

public class LabNumPrimo {

	public static void main(String[] args) {
		// passo 2 - criando a variavel para receber o numero a ser avaliado
		int numero = 3;
		// passo 3 variavel para fazer a contagem de divisores
		int qtdeDiv = 0;
		// criando um loop pra realizar as divisoes da variavel 
		for(int i = 1; i <= numero; i++) {
			int qtde = (numero % i);
			if(qtde == 0) {
				qtdeDiv++;
			}
		}
		
		//verificando se o valor da variavel numero é primo ou nao
		if(qtdeDiv <= 2 && numero != 0 && numero != 1) {
			System.out.println(numero + " : Este numero é primo");
		}else {
			System.out.println(numero + " : Este numero não é primo");
		}

	}

}
