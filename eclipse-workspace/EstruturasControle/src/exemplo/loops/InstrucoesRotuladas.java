package exemplo.loops;

public class InstrucoesRotuladas {

	public static void main(String[] args) {
		// primeira instrucao rotulada
		instrucao1:
			for(int i = 1; i < 4; i++) {
				// segunda instrucao rotulada
				instrucao2:
					for(int j = 1; j < 4; j++) {
						// instrucao de decisao
						if(j == 2) {
							System.out.println("Saindo da instrucao 1");
							break instrucao1;
						}
						System.out.println("Texto instrução2");
					}
				System.out.println("Texto instrução1");
			}

	}

}
