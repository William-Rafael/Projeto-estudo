package exemplo.intro.poo;

public class Exemplo1Atribuicao {

	public static void main(String[] args) {
		// instanciar a classe pessoa
		Pessoa joao = new Pessoa();
		Pessoa maria = new Pessoa();
		
		joao.genero = 'M';
		joao.idade = 44;
		
		maria.genero = 'F';
		maria.idade = 18;
		
		// realiza a atribuicao entre objetos distintos 
		joao = maria;
		//exibindo os valores
		System.out.println("Joao é do genero " + joao.genero + " e tem " + joao.idade + " anos de idade");
	}

}
