package calc.sobrecargas;

public class Calculadora {
	
	public double subtrair(double valor1, double valor2) {
 		//indicar a variavel para que receba a subtracao dos valores dos paramentros
 		double resultado;
 		
 		//estabelecendo a opera��o
 		resultado = valor1 - valor2;
 		
 		//implementando a expressao de retorno
 		return resultado;
 	}
	public double subtrair(int valor1, double valor2) {
 		//indicar a variavel para que receba a subtracao dos valores dos paramentros
 		double resultado;
 		
 		//estabelecendo a opera��o
 		resultado = valor1 - valor2;
 		
 		//implementando a expressao de retorno
 		return resultado;
	}
	public double subtrair(double valor1, int valor2) {
 		//indicar a variavel para que receba a subtracao dos valores dos paramentros
 		double resultado;
 		
 		//estabelecendo a opera��o
 		resultado = valor1 - valor2;
 		
 		//implementando a expressao de retorno
 		return resultado;
	}
}



/*A � Criando m�todos sobrecarregados na classe Calculadora
1. Utilizando a classe Calculadora do laborat�rio anterior, crie tr�s sobrecargas
do m�todo subtrair, uma recebendo como par�metros dois tipos double,
outra recebendo um int e um double e uma terceira recebendo um double e
um int. N�o se esque�a de seguir essa ordem;

2. Salve e compile a classe.
B � Testando a nova vers�o da classe Calculadora
1. Crie uma classe chamada Cap6_Lab2 e, nessa classe, crie o m�todo main;

2. Dentro dessa classe, crie uma inst�ncia de Calculadora e fa�a chamadas �s
vers�es sobrecarregadas do m�todo subtrair, criadas neste laborat�rio;
3. Execute o programa.
A sa�da ser� a seguinte:*/