package exemplo.loops;

public class ExemploContinue {

	public static void main(String[] args) {
		// declarando a variavel com o valor inicial  = 0
		int num = 0;
		// estabelecendo o loop while
		while(num < 10) {
			++num;
			//estrutura de decisao para o uso do continue
			if(num == 5) {
				continue;
			}
			System.out.println("Valor de num = " + num);
		}

	}

}
