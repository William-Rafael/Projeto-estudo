package desafio1;

public class UmaMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][];
		matriz = new int[10][10];
		
		//criando as 10 linhas
		for(int linha = 0; linha <10; linha++) {
			//iniciando o loop para tentar criar as 10 colunas
			for(int coluna = 0; coluna < 10; coluna++) {
				matriz[linha][coluna] = (int)(Math.random()*9)+1; //o +1 retira o 0
			}
		}
		System.out.println("pronto A matriz foi preenchida!" );
		System.out.println("========================================");
		
		// exibindo cada valor em cada posicao da matriz - os quadradinhos
		// chamando minhas linhas
		
		System.out.println("Conteudo de cada posicao da matriz");
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 10; coluna++)
			//exibindo
			System.out.println("matriz["+linha+"]["+coluna+"] = " + matriz[linha][coluna]);
		}
	}
	
	System.out.println("========================================");
	//exibindo os valores da matriz
	// com seus valores e sem indices posicionais
	
	System.out.println("Matriz exibida somente com seus respectivos valores");
	for(int linha = 0; linha < 10; linha++) {
		for(int coluna = 0; coluna < 10; coluna++) {
			System.out.print(matriz[linha][coluna] + " ");
		}
		System.out.println();
	}
	System.out.println("========================================");
	System.out.println("Acessando e somando os valores da 3 coluna da matriz");
	int somaCol3 = 0;
	//tentando acessar 3 coluna da matriz
	for(int coluna = 0; coluna < 10; coluna++) {
		somaCol3 = somaCol3 + matriz[coluna][2];
	}
	System.out.println(somaCol3);
	}
}
