package Laboratoriocap7;

public class Cap7_Lab1 {
	public static void main(String[] args) {
		
		
		//fazer as instancias para 3 objetos
		
		Cadastro valor = new Cadastro();
		valor.mostrar();
		System.out.println("");
		
		Cadastro valor1 = new Cadastro("Claudio","Abreu" , 0);
		valor1.mostrar();
		System.out.println("");
		Cadastro valor2 = new Cadastro("Loudes","Souza", 40);
		valor2.mostrar();
		
		
		}

	
	
	}




/*A � Criando a classe Cadastro com m�ltiplos construtores
1. Crie uma classe com o nome Cadastro e declare os atributos privados nome,
sobrenome e idade;

2. Crie os assessores getter e setter para cada atributo;

3. Insira o construtor padr�o da classe;

4. Crie um construtor que receba os par�metros nome e sobrenome e atribua
os valores desses par�metros aos atributos da classe;

5. Crie outro construtor que receba os par�metros nome, sobrenome e idade
e atribua os valores desses par�metros aos atributos da classe;

6. Crie um m�todo chamado mostrar que exiba na tela o valor de cada atributo
da classe;

7. Salve e compile a classe.*/