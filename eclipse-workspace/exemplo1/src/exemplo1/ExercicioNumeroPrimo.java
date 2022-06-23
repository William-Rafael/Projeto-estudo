package exemplo1;

public class ExercicioNumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroPrimo = 8;
		int contador = 0;
		int qtd = 1;
		
		do {
			int restoDivisao = 2%qtd;
					if(restoDivisao == 0) {
						contador ++;
					}
			qtd++;
		}while(qtd<=numeroPrimo);
		if(contador == 2) {
			System.out.println("O numero é primo" + numeroPrimo);
			
		}else {
			System.out.println("o numero não é primo");
		}

	}

}
