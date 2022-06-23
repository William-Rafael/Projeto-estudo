package calc.sobrecargas;



public class Cap6_Lab2 {
	public static void main(String args[]) {
	//fazer a instancia da classe Calculadora()	
	Calculadora calc = new Calculadora();
		
	double resultado;
	double resultado2;
	double resultado3;
	
	
	
	resultado = calc.subtrair(3.2d, 0.1d);
	resultado2 = calc.subtrair(5, 0.8d);
	resultado3 = calc.subtrair(-0.2d, -3);
	System.out.println("Chamando a versao de subtrair com 2 double:" + resultado);
	System.out.println("Chamando a versao de subtrair com 1 double e um int:" + resultado2);
	System.out.println("Chamando a versao de subtrair com 1 int e um double:" + resultado3);
	
		
	}

	
	}
	




/*Laboratório 3
A - Criando a classe Aluno
1. Crie uma classe denominada Aluno;
2. Nessa classe, crie um campo de acesso private da string chamada nome;
3. Crie os métodos getter e setter para acesso ao campo nome;
4. Crie um novo campo público, estático, do tipo int e de nome
contadorDeAlunos;
5. Salve e compile sua classe.
B - Criando a classe Cap6_Lab3 para testar a classe Aluno
1. Crie uma classe chamada Cap6_Lab3 e garanta que o método main seja
criado nessa classe;
2. Instancie três objetos Aluno com os nomes: “joao”, “maria” e “marcos”;*/