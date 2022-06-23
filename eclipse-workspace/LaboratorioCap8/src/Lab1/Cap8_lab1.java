package Lab1;

public class Cap8_lab1 {

	static int maiorNumero(int array[]) {
		int maior = 0;
		
		for(int i = 0; i < array.length; i++)
	{
		if(array[i] > maior)
		{
			maior = array[i];
		}
	}
	return maior;
	
	
}


	public static void main(String[] args) {
		
		int[] numeros = {1, 2, 3, 4, 5, 50, 15, 20, 30};
		int maior = maiorNumero(numeros);
		System.out.println("O Maior numero é: " + maior);
	}
}