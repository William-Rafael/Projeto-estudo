package calc.sobrecargas;

public class Calculadora {
	
	public double subtrair(double valor1, double valor2) {
 		//indicar a variavel para que receba a subtracao dos valores dos paramentros
 		double resultado;
 		
 		//estabelecendo a operação
 		resultado = valor1 - valor2;
 		
 		//implementando a expressao de retorno
 		return resultado;
 	}
	public double subtrair(int valor1, double valor2) {
 		//indicar a variavel para que receba a subtracao dos valores dos paramentros
 		double resultado;
 		
 		//estabelecendo a operação
 		resultado = valor1 - valor2;
 		
 		//implementando a expressao de retorno
 		return resultado;
	}
	public double subtrair(double valor1, int valor2) {
 		//indicar a variavel para que receba a subtracao dos valores dos paramentros
 		double resultado;
 		
 		//estabelecendo a operação
 		resultado = valor1 - valor2;
 		
 		//implementando a expressao de retorno
 		return resultado;
	}
}



/*A – Criando métodos sobrecarregados na classe Calculadora
1. Utilizando a classe Calculadora do laboratório anterior, crie três sobrecargas
do método subtrair, uma recebendo como parâmetros dois tipos double,
outra recebendo um int e um double e uma terceira recebendo um double e
um int. Não se esqueça de seguir essa ordem;

2. Salve e compile a classe.
B – Testando a nova versão da classe Calculadora
1. Crie uma classe chamada Cap6_Lab2 e, nessa classe, crie o método main;

2. Dentro dessa classe, crie uma instância de Calculadora e faça chamadas às
versões sobrecarregadas do método subtrair, criadas neste laboratório;
3. Execute o programa.
A saída será a seguinte:*/