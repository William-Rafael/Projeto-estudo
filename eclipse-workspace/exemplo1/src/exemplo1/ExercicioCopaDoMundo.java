package exemplo1;

public class ExercicioCopaDoMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int ano1 = 1930; ano1 <= 2022; ano1 = ano1 + 4) {

			if ((ano1 == 1942) || (ano1 == 1946)) {
				continue;

			}
			System.out.println("Os anos que tiveram copa foram : " + ano1);
		}

	}

}

/*
 * A - Exibindo os anos de ocorr�ncia de todas as copas do mundo de futebol
 * //Vamos criar um programa que imprime na tela todos os anos em que houve
 * //Copa do Mundo de Futebol.
 * 
 * //1. Crie uma classe e insira a estrutura b�sica de um programa Java;
 * 
 * //2. Utilize a estrutura for, declarando a vari�vel inteira ano e
 * inicializando //com o valor 1930 (ano da primeira copa do mundo). Esta
 * vari�vel dever� ser //incrementada de 4 em 4 (per�odo entre as copas) at�
 * atingir o ano atual;
 * 
 * //3. Considere o caso dos anos de 1942 e 1946 que foram anos em que n�o
 * //ocorreram copas devido � segunda guerra mundial; //Dica: Utilize uma das
 * op��es de break/continue
 */